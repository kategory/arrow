package arrow.recursion.data

import arrow.core.Eval
import arrow.higherkind
import arrow.recursion.Algebra

/**
 * Type level combinator for obtaining the least fixed point of a type.
 * This type is the type level encoding of cata.
 */
@higherkind
interface Mu<F> : MuOf<F> {
  fun <A> unMu(): Algebra<F, Eval<A>>

  companion object
}
