package arrow.optics.std

import arrow.core.Either
import arrow.core.Right
import arrow.core.test.UnitSpec
import arrow.core.test.generators.either
import arrow.core.test.generators.functionAToB
import arrow.core.test.generators.validated
import arrow.core.zip
import arrow.optics.Iso
import arrow.optics.test.laws.IsoLaws
import arrow.typeclasses.Eq
import arrow.typeclasses.Monoid
import io.kotlintest.properties.Gen

class ValidatedTest : UnitSpec() {

  init {

    testLaws(
      IsoLaws.laws(
        iso = Iso.either(),
        aGen = Gen.validated(Gen.string(), Gen.int()),
        bGen = Gen.either(Gen.string(), Gen.int()),
        funcGen = Gen.functionAToB(Gen.either(Gen.string(), Gen.int())),
        EQA = Eq.any(),
        EQB = Eq.any(),
        bMonoid = object : Monoid<Either<String, Int>> {
          override fun empty() = Right(0)

          override fun Either<String, Int>.combine(b: Either<String, Int>): Either<String, Int> =
            this.zip(b) { a, b -> a + b }
        }
      )
    )
  }
}
