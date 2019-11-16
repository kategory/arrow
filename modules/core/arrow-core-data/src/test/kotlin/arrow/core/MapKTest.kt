package arrow.core

import arrow.Kind
import arrow.Kind2
import arrow.core.extensions.eq
import arrow.core.extensions.hash
import arrow.core.extensions.mapk.eq.eq
import arrow.core.extensions.mapk.foldable.foldable
import arrow.core.extensions.mapk.functor.functor
import arrow.core.extensions.mapk.functorFilter.functorFilter
import arrow.core.extensions.mapk.hash.hash
import arrow.core.extensions.mapk.monoid.monoid
import arrow.core.extensions.mapk.semialign.semialign
import arrow.core.extensions.mapk.show.show
import arrow.core.extensions.mapk.traverse.traverse
import arrow.core.extensions.semigroup
import arrow.test.UnitSpec
import arrow.test.generators.mapK
import arrow.test.laws.EqLaws
import arrow.test.laws.FoldableLaws
import arrow.test.laws.FunctorFilterLaws
import arrow.test.laws.HashLaws
import arrow.test.laws.MonoidLaws
import arrow.test.laws.SemialignLaws
import arrow.test.laws.ShowLaws
import arrow.test.laws.TraverseLaws
import arrow.typeclasses.Eq
import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll
import kotlin.math.max

class MapKTest : UnitSpec() {

  val EQ: Eq<Kind2<ForMapK, String, Int>> = object : Eq<Kind2<ForMapK, String, Int>> {
    override fun Kind2<ForMapK, String, Int>.eqv(b: Kind2<ForMapK, String, Int>): Boolean =
      fix()["key"] == b.fix()["key"]
  }

  init {
    val EQ_TC = MapK.eq(String.eq(), Int.eq())

    testLaws(
      ShowLaws.laws(MapK.show(), EQ_TC) { mapOf(it.toString() to it).k() },
      TraverseLaws.laws(MapK.traverse(), MapK.functor(), { a: Int -> mapOf("key" to a).k() }, EQ),
      MonoidLaws.laws(MapK.monoid<String, Int>(Int.semigroup()), Gen.mapK(Gen.string(), Gen.int()), EQ),
      FoldableLaws.laws(MapK.foldable(), { a: Int -> mapOf("key" to a).k() }, Eq.any()),
      EqLaws.laws(EQ) { mapOf(it.toString() to it).k() },
      FunctorFilterLaws.laws(MapK.functorFilter(), { mapOf(it.toString() to it).k() }, EQ),
      HashLaws.laws(MapK.hash(String.hash(), Int.hash()), EQ_TC) { mapOf("key" to it).k() },
      SemialignLaws.laws(MapK.semialign(),
        Gen.mapK(Gen.string(), Gen.int()) as Gen<Kind<MapKPartialOf<String>, Int>>,
        { MapK.eq(String.eq(), it) as Eq<Kind<MapKPartialOf<String>, *>> },
        MapK.foldable<String>()
      )
    )

    "can align maps" {
      forAll(Gen.mapK(Gen.string(), Gen.bool()), Gen.mapK(Gen.string(), Gen.bool())) { a, b ->
        MapK.semialign<String>().run {
          val aligned = align(a, b).fix()

          aligned.size == (a.keys + b.keys).size
        }
      }

      forAll(Gen.mapK(Gen.string(), Gen.bool()), Gen.mapK(Gen.string(), Gen.bool())) { a, b ->
        MapK.semialign<String>().run {
          val aligned = align(a, b).fix()
          a.keys.intersect(b.keys).all {
            aligned[it]?.isBoth ?: false
          }
        }
      }
    }
  }
}
