package arrow.core.extensions

import arrow.core.Either
import arrow.core.Eval
import arrow.core.EvalOf
import arrow.core.ForEval
import arrow.core.extensions.eval.monad.monad
import arrow.core.fix
import arrow.extension
import arrow.typeclasses.Applicative
import arrow.typeclasses.Apply
import arrow.typeclasses.Bimonad
import arrow.typeclasses.Comonad
import arrow.typeclasses.Functor
import arrow.typeclasses.Monad
import arrow.typeclasses.suspended.monad.Fx

@extension
interface EvalFunctor : Functor<ForEval> {
  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)
}

@extension
interface EvalApply : Apply<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)
}

@extension
interface EvalApplicative : Applicative<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)

  override fun <A> just(a: A): Eval<A> =
    Eval.just(a)
}

@extension
interface EvalMonad : Monad<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.flatMap(f: (A) -> EvalOf<B>): Eval<B> =
    fix().flatMap(f)

  override fun <A, B> tailRecM(a: A, f: kotlin.Function1<A, EvalOf<Either<A, B>>>): Eval<B> =
    Eval.tailRecM(a, f)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)

  override fun <A> just(a: A): Eval<A> =
    Eval.just(a)
}

@extension
interface EvalComonad : Comonad<ForEval> {
  override fun <A, B> EvalOf<A>.coflatMap(f: (EvalOf<A>) -> B): Eval<B> =
    fix().coflatMap(f)

  override fun <A> EvalOf<A>.extract(): A =
    fix().extract()

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)
}

@extension
interface EvalBimonad : Bimonad<ForEval> {
  override fun <A, B> EvalOf<A>.ap(ff: EvalOf<(A) -> B>): Eval<B> =
    fix().ap(ff)

  override fun <A, B> EvalOf<A>.flatMap(f: (A) -> EvalOf<B>): Eval<B> =
    fix().flatMap(f)

  override fun <A, B> tailRecM(a: A, f: kotlin.Function1<A, EvalOf<Either<A, B>>>): Eval<B> =
    Eval.tailRecM(a, f)

  override fun <A, B> EvalOf<A>.map(f: (A) -> B): Eval<B> =
    fix().map(f)

  override fun <A> just(a: A): Eval<A> =
    Eval.just(a)

  override fun <A, B> EvalOf<A>.coflatMap(f: (EvalOf<A>) -> B): Eval<B> =
    fix().coflatMap(f)

  override fun <A> EvalOf<A>.extract(): A =
    fix().extract()
}

@extension
interface EvalFx<A> : Fx<ForEval> {
  override fun monad(): Monad<ForEval> = Eval.monad()
}
