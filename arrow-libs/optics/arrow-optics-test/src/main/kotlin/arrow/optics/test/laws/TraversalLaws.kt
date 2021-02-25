package arrow.optics.test.laws

import arrow.core.Option
import arrow.core.compose
import arrow.core.identity
import arrow.core.toOption
import arrow.optics.Traversal
import arrow.core.test.laws.Law
import arrow.core.test.laws.equalUnderTheLaw
import arrow.typeclasses.Eq
import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll

object TraversalLaws {

  fun <A, B : Any> laws(traversal: Traversal<A, B>, aGen: Gen<A>, bGen: Gen<B>, funcGen: Gen<(B) -> B>, EQA: Eq<A>, EQOptionB: Eq<Option<B>>) = listOf(
    Law("Traversal law: head option") { traversal.headOption(aGen, EQOptionB) },
    Law("Traversal law: modify get all") { traversal.modifyGetAll(aGen, funcGen) },
    Law("Traversal law: set is idempotent") { traversal.setIdempotent(aGen, bGen, EQA) },
    Law("Traversal law: modify identity") { traversal.modifyIdentity(aGen, EQA) },
    Law("Traversal law: compose modify") { traversal.composeModify(aGen, funcGen, EQA) }
  )

  fun <A, B : Any> Traversal<A, B>.headOption(aGen: Gen<A>, EQOptionB: Eq<Option<B>>): Unit =
    forAll(aGen) { a ->
      headOption(a)
        .equalUnderTheLaw(getAll(a).firstOrNull().toOption(), EQOptionB)
    }

  fun <A, B> Traversal<A, B>.modifyGetAll(aGen: Gen<A>, funcGen: Gen<(B) -> B>): Unit =
    forAll(aGen, funcGen) { a, f ->
      getAll(modify(a, f))
        .equalUnderTheLaw(getAll(a).map(f), Eq.any())
    }

  fun <A, B> Traversal<A, B>.setIdempotent(aGen: Gen<A>, bGen: Gen<B>, EQA: Eq<A>): Unit =
    forAll(aGen, bGen) { a, b ->
      set(set(a, b), b)
        .equalUnderTheLaw(set(a, b), EQA)
    }

  fun <A, B> Traversal<A, B>.modifyIdentity(aGen: Gen<A>, EQA: Eq<A>): Unit =
    forAll(aGen) { a ->
      modify(a, ::identity).equalUnderTheLaw(a, EQA)
    }

  fun <A, B> Traversal<A, B>.composeModify(aGen: Gen<A>, funcGen: Gen<(B) -> B>, EQA: Eq<A>): Unit =
    forAll(aGen, funcGen, funcGen) { a, f, g ->
      modify(modify(a, f), g)
        .equalUnderTheLaw(modify(a, g compose f), EQA)
    }
}
