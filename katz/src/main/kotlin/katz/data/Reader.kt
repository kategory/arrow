package katz

infix fun <A, B, C> ((B) -> C).compose(f: (A) -> B): (A) -> C = { a: A -> this(f(a)) }

infix fun <A, B, C> ((A) -> B).andThen(g: (B) -> C): (A) -> C = { a: A -> g(this(a)) }

inline fun <D, A> ((D) -> A).reader(): ReaderT<Id.F, D, A> = Reader(this)

fun <D, A> ReaderT<Id.F, D, A>.runId(d: D): A = this.run(d).value()

object Reader {
    operator fun <D, A> invoke(run: (D) -> A): ReaderT<Id.F, D, A> = Kleisli(run.andThen { Id(it) }, Id)

    fun <D, A> pure(x: A): ReaderT<Id.F, D, A> = KleisliC.pure<Id.F, D, A>(x)

    fun <D> ask(): ReaderT<Id.F, D, D> = KleisliC.ask<Id.F, D>()

}