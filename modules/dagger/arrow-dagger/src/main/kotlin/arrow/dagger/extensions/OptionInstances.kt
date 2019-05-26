package arrow.dagger.extensions

import arrow.core.ForOption
import arrow.core.Option
import arrow.core.extensions.option.applicative.applicative
import arrow.core.extensions.option.foldable.foldable
import arrow.core.extensions.option.functor.functor
import arrow.core.extensions.option.monad.monad
import arrow.core.extensions.option.monadError.monadError
import arrow.core.extensions.option.traverse.traverse
import arrow.core.typeclasses.Applicative
import arrow.core.typeclasses.Foldable
import arrow.core.typeclasses.Functor
import arrow.core.typeclasses.Monad
import arrow.core.typeclasses.MonadError
import arrow.core.typeclasses.Traverse
import dagger.Module
import dagger.Provides

@Module
class OptionInstances {

  @Provides
  fun optionFunctor(): Functor<ForOption> = Option.functor()

  @Provides
  fun optionApplicative(): Applicative<ForOption> = Option.applicative()

  @Provides
  fun optionMonad(): Monad<ForOption> = Option.monad()

  @Provides
  fun optionMonadError(): MonadError<ForOption, Unit> = Option.monadError()

  @Provides
  fun optionFoldable(): Foldable<ForOption> = Option.foldable()

  @Provides
  fun optionTraverse(): Traverse<ForOption> = Option.traverse()
}
