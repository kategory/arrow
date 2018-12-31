package arrow.effects.internal

import arrow.Kind
import arrow.core.*
import arrow.effects.CancelToken
import arrow.effects.MVar
import arrow.effects.typeclasses.*
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.EmptyCoroutineContext

typealias Callback<A> = (Either<Nothing, A>) -> Unit

internal class CancelableMVar<F, A> private constructor(initial: State<A>, CF: Concurrent<F>) : MVar<F, A>, Concurrent<F> by CF {

  private val state = AtomicReference(initial)

  companion object {
    /** Builds an [UncancelableMVar] instance with an [initial] value. */
    operator fun <F, A> invoke(initial: A, CF: Concurrent<F>): Kind<F, MVar<F, A>> = CF.delay {
      CancelableMVar(State(initial), CF)
    }

    /** Returns an empty [UncancelableMVar] instance. */
    fun <F, A> empty(CF: Concurrent<F>): Kind<F, MVar<F, A>> = CF.delay {
      CancelableMVar(State.empty<A>(), CF)
    }

    internal class CallbackId
    internal sealed class State<out A> {
      companion object {
        private val ref = WaitForPut<Any>(linkedMapOf(), linkedMapOf())
        operator fun <A> invoke(a: A): State<A> = WaitForTake(a, linkedMapOf())
        /** `Empty` state, reusing the same instance. */
        fun <A> empty(): State<A> = ref as State<A>
      }

      data class WaitForPut<A>(val reads: Map<CallbackId, Callback<A>>, val takes: Map<CallbackId, Callback<A>>) : State<A>()
      data class WaitForTake<A>(val value: A, val listeners: Map<CallbackId, Tuple2<A, Callback<Unit>>>) : State<A>()
    }
  }

  override fun isEmpty(): Kind<F, Boolean> = delay {
    when (state.get()) {
      is State.WaitForPut -> true
      is State.WaitForTake -> false
    }
  }

  override fun isNotEmpty(): Kind<F, Boolean> = delay {
    when (state.get()) {
      is State.WaitForPut -> false
      is State.WaitForTake -> true
    }
  }

  override fun put(a: A): Kind<F, Unit> =
    tryPut(a).flatMap { didPut ->
      if (didPut) unit() else cancelableF { cb -> unsafePut(a, cb) }
    }

  override fun tryPut(a: A): Kind<F, Boolean> =
    defer { unsafeTryPut(a) }

  override fun take(): Kind<F, A> =
    tryTake().flatMap {
      it.fold({ cancelableF(::unsafeTake) }, ::just)
    }

  override fun tryTake(): Kind<F, Option<A>> =
    defer { unsafeTryTake() }

  override fun read(): Kind<F, A> =
    cancelable(::unsafeRead)

  private tailrec fun unsafeTryPut(a: A): Kind<F, Boolean> =
    when (val current = state.get()) {
      is State.WaitForTake -> just(false)
      is State.WaitForPut -> {
        val first = current.takes.values.firstOrNull()
        val update: State<A> = if (current.takes.isEmpty()) State(a) else {
          val rest = current.takes.toList().drop(1)
          if (rest.isEmpty()) State.empty()
          else State.WaitForPut(emptyMap(), rest.toMap())
        }

        if (!state.compareAndSet(current, update)) {
          unsafeTryPut(a)
        } else if (first != null || current.reads.isNotEmpty()) {
          streamPutAndReads(a, first, current.reads)
        } else just(true)
      }
    }

  private tailrec fun unsafePut(a: A, onPut: Callback<Unit>): Kind<F, CancelToken<F>> =
    when (val current = state.get()) {
      is State.WaitForTake -> {
        val id = CallbackId()
        val newMap = current.listeners + Pair(id, Tuple2(a, onPut))
        if (state.compareAndSet(current, State.WaitForTake(current.value, newMap))) just(delay { unsafeCancelPut(id) })
        else unsafePut(a, onPut)
      }
      is State.WaitForPut -> {
        val first = current.takes.values.firstOrNull()
        val update = if (current.takes.isEmpty()) State(a) else {
          val rest = current.takes.toList().drop(1)
          if (rest.isEmpty()) State.empty()
          else State.WaitForPut(emptyMap(), rest.toMap())
        }

        if (state.compareAndSet(current, update)) {
          if (first != null || current.reads.isNotEmpty()) streamPutAndReads(a, first, current.reads).map {
            onPut(rightUnit)
            unit()
          } else {
            onPut(rightUnit)
            just(unit())
          }
        } else unsafePut(a, onPut)
      }
    }

  private tailrec fun unsafeCancelPut(id: CallbackId): Unit =
    when (val current = state.get()) {
      is State.WaitForTake -> {
        val update = current.copy(listeners = current.listeners - id)
        if (state.compareAndSet(current, update)) Unit
        else unsafeCancelPut(id)
      }
      is State.WaitForPut -> Unit
    }

  private tailrec fun unsafeTryTake(): Kind<F, Option<A>> =
    when (val current = state.get()) {
      is State.WaitForTake -> {
        if (current.listeners.isEmpty()) {
          if (state.compareAndSet(current, State.empty())) just(Some(current.value))
          else unsafeTryTake()
        } else {
          val (ax, notify) = current.listeners.values.first()
          val xs = current.listeners.toList().drop(1)
          if (state.compareAndSet(current, State.WaitForTake(ax, xs.toMap()))) delay { notify(rightUnit) }.startF(ImmediateContext).map { Some(current.value) }
          else unsafeTryTake()
        }
      }
      is State.WaitForPut -> just(None)
    }

  private tailrec fun unsafeTake(onTake: Callback<A>): Kind<F, CancelToken<F>> =
    when (val current = state.get()) {
      is State.WaitForTake -> {
        if (current.listeners.isEmpty()) {
          if (state.compareAndSet(current, State.empty())) {
            onTake(Right(current.value))
            just(unit())
          } else {
            unsafeTake(onTake)
          }
        } else {
          val (ax, notify) = current.listeners.values.first()
          val xs = current.listeners.toList().drop(0)
          if (state.compareAndSet(current, State.WaitForTake(ax, xs.toMap()))) {
            delay { notify(rightUnit) }.startF(ImmediateContext).map {
              onTake(Right(current.value))
              unit()
            }
          } else unsafeTake(onTake)
        }
      }
      is State.WaitForPut -> {
        val id = CallbackId()
        val newQueue = current.takes + Pair(id, onTake)
        if (state.compareAndSet(current, State.WaitForPut(current.reads, newQueue))) just(delay { unsafeCancelTake(id) })
        else unsafeTake(onTake)
      }
    }

  private tailrec fun unsafeCancelTake(id: CallbackId): Unit =
    when (val current = state.get()) {
      is State.WaitForPut -> {
        val newMap = current.takes - id
        val update = State.WaitForPut(current.reads, newMap)
        if (state.compareAndSet(current, update)) Unit
        else unsafeCancelTake(id)
      }
      is State.WaitForTake -> Unit
    }

  private tailrec fun unsafeRead(onRead: Callback<A>): Kind<F, Unit> =
    when (val current = state.get()) {
      is State.WaitForTake -> {
        onRead(Right(current.value))
        unit()
      }
      is State.WaitForPut -> {
        val id = CallbackId()
        val newReads = current.reads + Pair(id, onRead)
        if (state.compareAndSet(current, State.WaitForPut(newReads, current.takes))) delay { unsafeCancelRead(id) }
        else unsafeRead(onRead)
      }
    }

  private tailrec fun unsafeCancelRead(id: CallbackId): Unit =
    when (val current = state.get()) {
      is State.WaitForPut -> {
        val newMap = current.reads - id
        val update = State.WaitForPut(newMap, current.takes)
        if (state.compareAndSet(current, update)) Unit
        else unsafeCancelRead(id)
      }
      is State.WaitForTake -> Unit
    }

  private fun streamPutAndReads(a: A, put: Callback<A>?, reads: Map<CallbackId, Callback<A>>): Kind<F, Boolean> {
    val value = Right(a)
    return streamAll(value, reads.values).flatMap { _ ->
      if (put != null) delay { put(value) }.startF(ImmediateContext).map { true }
      else just(true)
    }
  }

  // For streaming a value to a whole `reads` collection
  private fun streamAll(value: Either<Nothing, A>, listeners: Iterable<Callback<A>>): Kind<F, Unit> =
    listeners.fold(null as Kind<F, Fiber<F, Unit>>?) { acc, cb ->
      val task = delay { cb(value) }.startF(EmptyCoroutineContext)
      acc?.flatMap { task } ?: task
    }?.map(mapUnit) ?: unit()

}