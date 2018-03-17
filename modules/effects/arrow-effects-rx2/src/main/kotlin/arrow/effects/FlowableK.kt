package arrow.effects

import arrow.Kind
import arrow.core.Either
import arrow.core.Eval
import arrow.core.Left
import arrow.core.Right
import arrow.deriving
import arrow.effects.ContextScheduler.asScheduler
import arrow.higherkind
import arrow.typeclasses.Applicative
import arrow.typeclasses.Foldable
import arrow.typeclasses.Functor
import arrow.typeclasses.Traverse
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.FlowableEmitter
import kotlin.coroutines.experimental.CoroutineContext

fun <A> Flowable<A>.k(): FlowableK<A> = FlowableK(this)

fun <A> FlowableKOf<A>.value(): Flowable<A> = this.fix().flowable

@higherkind
@deriving(
        Functor::class,
        Applicative::class,
        Foldable::class,
        Traverse::class
)
data class FlowableK<A>(val flowable: Flowable<A>) : FlowableKOf<A>, FlowableKKindedJ<A> {

    fun <B> map(f: (A) -> B): FlowableK<B> =
            flowable.map(f).k()

    fun <B> ap(fa: FlowableKOf<(A) -> B>): FlowableK<B> =
            flatMap { a -> fa.fix().map { ff -> ff(a) } }

    fun <B> flatMap(f: (A) -> FlowableKOf<B>): FlowableK<B> =
            flowable.flatMap { f(it).fix().flowable }.k()

    fun <B> flatMapIn(context: CoroutineContext, f: (A) -> FlowableKOf<B>): FlowableK<B> =
            flowable.observeOn(context.asScheduler()).flatMap { f(it).fix().flowable }.k()

    fun <B> concatMap(f: (A) -> FlowableKOf<B>): FlowableK<B> =
            flowable.concatMap { f(it).fix().flowable }.k()

    fun <B> concatMapIn(context: CoroutineContext, f: (A) -> FlowableKOf<B>): FlowableK<B> =
            flowable.observeOn(context.asScheduler()).concatMap { f(it).fix().flowable }.k()

    fun <B> switchMap(f: (A) -> FlowableKOf<B>): FlowableK<B> =
            flowable.switchMap { f(it).fix().flowable }.k()

    fun <B> switchMapIn(context: CoroutineContext, f: (A) -> FlowableKOf<B>): FlowableK<B> =
            flowable.observeOn(context.asScheduler()).switchMap { f(it).fix().flowable }.k()

    fun <B> foldLeft(b: B, f: (B, A) -> B): B = flowable.reduce(b, f).blockingGet()

    fun <B> foldRight(lb: Eval<B>, f: (A, Eval<B>) -> Eval<B>): Eval<B> {
        fun loop(fa_p: FlowableK<A>): Eval<B> = when {
            fa_p.flowable.isEmpty.blockingGet() -> lb
            else -> f(fa_p.flowable.blockingFirst(), Eval.defer { loop(fa_p.flowable.skip(1).k()) })
        }

        return Eval.defer { loop(this) }
    }

    fun <G, B> traverse(f: (A) -> Kind<G, B>, GA: Applicative<G>): Kind<G, FlowableK<B>> =
            foldRight(Eval.always { GA.pure(Flowable.empty<B>().k()) }) { a, eval ->
                GA.map2Eval(f(a), eval) { Flowable.concat(Flowable.just<B>(it.a), it.b.flowable).k() }
            }.value()

    fun runAsync(cb: (Either<Throwable, A>) -> FlowableKOf<Unit>): FlowableK<Unit> =
            flowable.flatMap { cb(Right(it)).value() }.onErrorResumeNext(io.reactivex.functions.Function { cb(Left(it)).value() }).k()

    companion object {
        fun <A> pure(a: A): FlowableK<A> =
                Flowable.just(a).k()

        fun <A> raiseError(t: Throwable): FlowableK<A> =
                Flowable.error<A>(t).k()

        operator fun <A> invoke(fa: () -> A): FlowableK<A> =
                defer { pure(fa()) }

        fun <A> defer(fa: () -> FlowableKOf<A>): FlowableK<A> =
                Flowable.defer { fa().value() }.k()

        fun <A> async(fa: Proc<A>, mode: BackpressureStrategy = BackpressureStrategy.BUFFER): FlowableK<A> =
                Flowable.create({ emitter: FlowableEmitter<A> ->
                    fa { either: Either<Throwable, A> ->
                        either.fold({
                            emitter.onError(it)
                        }, {
                            emitter.onNext(it)
                            emitter.onComplete()
                        })

                    }
                }, mode).k()

        tailrec fun <A, B> tailRecM(a: A, f: (A) -> FlowableKOf<Either<A, B>>): FlowableK<B> {
            val either = f(a).fix().value().blockingFirst()
            return when (either) {
                is Either.Left -> tailRecM(either.a, f)
                is Either.Right -> Flowable.just(either.b).k()
            }
        }

        fun monadFlat(): FlowableKMonadInstance = FlowableKMonadInstanceImplicits.instance()

        fun monadConcat(): FlowableKMonadInstance = object : FlowableKMonadInstance {
            override fun <A, B> flatMap(fa: FlowableKOf<A>, f: (A) -> FlowableKOf<B>): FlowableK<B> =
                    fa.fix().concatMap { f(it).fix() }
        }

        fun monadSwitch(): FlowableKMonadInstance = object : FlowableKMonadInstance {
            override fun <A, B> flatMap(fa: FlowableKOf<A>, f: (A) -> FlowableKOf<B>): FlowableK<B> =
                    fa.fix().switchMap { f(it).fix() }
        }

        fun monadErrorFlat(): FlowableKMonadErrorInstance = FlowableKMonadErrorInstanceImplicits.instance()

        fun monadErrorConcat(): FlowableKMonadErrorInstance = object : FlowableKMonadErrorInstance {
            override fun <A, B> flatMap(fa: FlowableKOf<A>, f: (A) -> FlowableKOf<B>): FlowableK<B> =
                    fa.fix().concatMap { f(it).fix() }
        }

        fun monadErrorSwitch(): FlowableKMonadErrorInstance = object : FlowableKMonadErrorInstance {
            override fun <A, B> flatMap(fa: FlowableKOf<A>, f: (A) -> FlowableKOf<B>): FlowableK<B> =
                    fa.fix().switchMap { f(it).fix() }
        }
    }
}

fun <A> FlowableKOf<A>.handleErrorWith(function: (Throwable) -> FlowableK<A>): FlowableK<A> =
        this.fix().flowable.onErrorResumeNext { t: Throwable -> function(t).flowable }.k()