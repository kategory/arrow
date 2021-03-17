package arrow.core.extensions.sequencek.functor

import arrow.Kind
import arrow.core.ForSequenceK
import arrow.core.SequenceK
import arrow.core.SequenceK.Companion
import arrow.core.Tuple2
import arrow.core.extensions.SequenceKFunctor

/**
 * cached extension
 */
@PublishedApi()
internal val functor_singleton: SequenceKFunctor = object : arrow.core.extensions.SequenceKFunctor
{}

/**
 *  Transform the [F] wrapped value [A] into [B] preserving the [F] structure
 *  Kind<F, A> -> Kind<F, B>
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.*
 * import arrow.core.extensions.sequencek.functor.*
 * import arrow.core.*
 *
 *
 *  import arrow.core.extensions.sequencek.applicative.just
 *
 *  fun main(args: Array<String>) {
 *   val result =
 *   //sampleStart
 *   "Hello".just().map({ "$it World" })
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.map(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.map(arg1: Function1<A, B>): SequenceK<B> =
  arrow.core.SequenceK.functor().run {
    this@map.map<A, B>(arg1) as arrow.core.SequenceK<B>
  }

@JvmName("imap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.map(arg1)"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.imap(arg1: Function1<A, B>, arg2: Function1<B, A>): SequenceK<B> =
  arrow.core.SequenceK.functor().run {
    this@imap.imap<A, B>(arg1, arg2) as arrow.core.SequenceK<B>
  }

/**
 *  Lifts a function `A -> B` to the [F] structure returning a polymorphic function
 *  that can be applied over all [F] values in the shape of Kind<F, A>
 *
 *  `A -> B -> Kind<F, A> -> Kind<F, B>`
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.*
 * import arrow.core.extensions.sequencek.functor.*
 * import arrow.core.*
 *
 *
 *  import arrow.core.extensions.sequencek.applicative.just
 *
 *  fun main(args: Array<String>) {
 *   val result =
 *   //sampleStart
 *   lift({ s: CharSequence -> "$s World" })("Hello".just())
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("lift")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "{ s: Sequence<A> -> s.map(arg0) }"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> lift(arg0: Function1<A, B>): Function1<Kind<ForSequenceK, A>, Kind<ForSequenceK, B>> =
  arrow.core.SequenceK
    .functor()
    .lift<A, B>(arg0) as kotlin.Function1<arrow.Kind<arrow.core.ForSequenceK, A>,
    arrow.Kind<arrow.core.ForSequenceK, B>>

@JvmName("void")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.void()",
    "arrow.core.void"
  ),
  DeprecationLevel.WARNING
)
fun <A> Kind<ForSequenceK, A>.void(): SequenceK<Unit> = arrow.core.SequenceK.functor().run {
  this@void.void<A>() as arrow.core.SequenceK<kotlin.Unit>
}

/**
 *  Applies [f] to an [A] inside [F] and returns the [F] structure with a tuple of the [A] value and the
 *  computed [B] value as result of applying [f]
 *
 *  Kind<F, A> -> Kind<F, Tuple2<A, B>>
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.extensions.sequencek.applicative.just
 *  import arrow.core.fproduct
 *
 *  fun main(args: Array<String>) {
 *   val result =
 *   //sampleStart
 *   "Hello".just().fproduct({ "$it World" })
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("fproduct")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.map { a -> Tuple2(a, arg1(a)) }",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.fproduct(arg1: Function1<A, B>): SequenceK<Tuple2<A, B>> =
  arrow.core.SequenceK.functor().run {
    this@fproduct.fproduct<A, B>(arg1) as arrow.core.SequenceK<arrow.core.Tuple2<A, B>>
  }

/**
 *  Replaces [A] inside [F] with [B] resulting in a Kind<F, B>
 *
 *  Kind<F, A> -> Kind<F, B>
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.extensions.sequencek.applicative.just
 *  import arrow.core.mapConst
 *
 *  fun main(args: Array<String>) {
 *   val result =
 *   //sampleStart
 *   "Hello World".just().mapConst("...")
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("mapConst")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.map { arg1 }"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.mapConst(arg1: B): SequenceK<B> =
  arrow.core.SequenceK.functor().run {
    this@mapConst.mapConst<A, B>(arg1) as arrow.core.SequenceK<B>
  }

/**
 *  Replaces the [B] value inside [F] with [A] resulting in a Kind<F, A>
 */
@JvmName("mapConst")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg1.map { this }"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> A.mapConst(arg1: Kind<ForSequenceK, B>): SequenceK<A> =
  arrow.core.SequenceK.functor().run {
    this@mapConst.mapConst<A, B>(arg1) as arrow.core.SequenceK<A>
  }

/**
 *  Pairs [B] with [A] returning a Kind<F, Tuple2<B, A>>
 *
 *  Kind<F, A> -> Kind<F, Tuple2<B, A>>
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.extensions.sequencek.applicative.just
 *  import arrow.core.tupleLeft
 *
 *  fun main(args: Array<String>) {
 *   val result =
 *   //sampleStart
 *   "Hello".just().tupleLeft("World")
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("tupleLeft")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.map { a -> Tuple2(arg1, a) }",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.tupleLeft(arg1: B): SequenceK<Tuple2<B, A>> =
  arrow.core.SequenceK.functor().run {
    this@tupleLeft.tupleLeft<A, B>(arg1) as arrow.core.SequenceK<arrow.core.Tuple2<B, A>>
  }

/**
 *  Pairs [A] with [B] returning a Kind<F, Tuple2<A, B>>
 *
 *  Kind<F, A> -> Kind<F, Tuple2<A, B>>
 *
 *  ```kotlin:ank:playground
 *  import arrow.core.extensions.sequencek.applicative.just
 *  import arrow.core.tupleRight
 *
 *  fun main(args: Array<String>) {
 *   val result =
 *   //sampleStart
 *   "Hello".just().tupleRight("World")
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("tupleRight")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.map { a -> Tuple2(a, arg1) }",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.tupleRight(arg1: B): SequenceK<Tuple2<A, B>> =
  arrow.core.SequenceK.functor().run {
    this@tupleRight.tupleRight<A, B>(arg1) as arrow.core.SequenceK<arrow.core.Tuple2<A, B>>
  }

/**
 *  Given [A] is a sub type of [B], re-type this value from Kind<F, A> to Kind<F, B>
 *
 *  Kind<F, A> -> Kind<F, B>
 *
 *  ```kotlin:ank:playground
 *  import arrow.Kind
 *  import arrow.core.extensions.sequencek.applicative.just
 *  import arrow.core.k
 *  import arrow.core.widen
 *
 *  fun main(args: Array<String>) {
 *   val result: Kind<*, CharSequence> =
 *   //sampleStart
 *   "Hello".just().map { "$it World" }.widen().k()
 *   //sampleEnd
 *   println(result)
 *  }
 *  ```
 */
@JvmName("widen")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.widen()",
    "arrow.core.widen"
  ),
  DeprecationLevel.WARNING
)
fun <B, A : B> Kind<ForSequenceK, A>.widen(): SequenceK<B> = arrow.core.SequenceK.functor().run {
  this@widen.widen<B, A>() as arrow.core.SequenceK<B>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(
  "Functor typeclass is deprecated. Use concrete methods on Sequence",
  level = DeprecationLevel.WARNING
)
inline fun Companion.functor(): SequenceKFunctor = functor_singleton