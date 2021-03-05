package arrow.syntax.function

/**
 * Marker class to be used as the representation of a non-appliled parameter
 */
class Partial<T>

private val CACHED = Partial<Any>()

@Suppress("UNCHECKED_CAST")
private fun <T> partial(): Partial<T> = CACHED as Partial<T>

@Deprecated(
  "Partially applying parameters through invoke is deprecated",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, R> ((P1, P2) -> R).invoke(p1: P1, partial2: Partial<P2> = partial()): (P2) -> R = partially1(p1)

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, R> ((P1, P2) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2): (P1) -> R = { p1: P1 -> this(p1, p2) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, R> ((P1, P2, P3) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial()): (P2, P3) -> R = { p2: P2, p3: P3 -> this(p1, p2, p3) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, R> ((P1, P2, P3) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial()): (P1, P3) -> R = { p1: P1, p3: P3 -> this(p1, p2, p3) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, R> ((P1, P2, P3) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3): (P1, P2) -> R = { p1: P1, p2: P2 -> this(p1, p2, p3) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial()): (P2, P3, P4) -> R = { p2: P2, p3: P3, p4: P4 -> this(p1, p2, p3, p4) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial()): (P1, P3, P4) -> R = { p1: P1, p3: P3, p4: P4 -> this(p1, p2, p3, p4) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial()): (P1, P2, P4) -> R = { p1: P1, p2: P2, p4: P4 -> this(p1, p2, p3, p4) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4): (P1, P2, P3) -> R = { p1: P1, p2: P2, p3: P3 -> this(p1, p2, p3, p4) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial()): (P2, P3, P4, P5) -> R = { p2: P2, p3: P3, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial()): (P1, P3, P4, P5) -> R = { p1: P1, p3: P3, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial()): (P1, P2, P4, P5) -> R = { p1: P1, p2: P2, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial()): (P1, P2, P3, P5) -> R = { p1: P1, p2: P2, p3: P3, p5: P5 -> this(p1, p2, p3, p4, p5) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5): (P1, P2, P3, P4) -> R = { p1: P1, p2: P2, p3: P3, p4: P4 -> this(p1, p2, p3, p4, p5) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial()): (P2, P3, P4, P5, P6) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial()): (P1, P3, P4, P5, P6) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial()): (P1, P2, P4, P5, P6) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial()): (P1, P2, P3, P5, P6) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial()): (P1, P2, P3, P4, P6) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6): (P1, P2, P3, P4, P5) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5, p6) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial()): (P2, P3, P4, P5, P6, P7) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial()): (P1, P3, P4, P5, P6, P7) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial()): (P1, P2, P4, P5, P6, P7) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial()): (P1, P2, P3, P5, P6, P7) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial()): (P1, P2, P3, P4, P6, P7) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial()): (P1, P2, P3, P4, P5, P7) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7): (P1, P2, P3, P4, P5, P6) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6, p7) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial()): (P2, P3, P4, P5, P6, P7, P8) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial()): (P1, P3, P4, P5, P6, P7, P8) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial()): (P1, P2, P4, P5, P6, P7, P8) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial()): (P1, P2, P3, P5, P6, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial()): (P1, P2, P3, P4, P6, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial()): (P1, P2, P3, P4, P5, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial()): (P1, P2, P3, P4, P5, P6, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8): (P1, P2, P3, P4, P5, P6, P7) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16, partial17: Partial<P17> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially17(p17)", "arrow.core.partially17")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16, partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially17(p17)", "arrow.core.partially17")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), p17: P17, partial18: Partial<P18> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially18(p18)", "arrow.core.partially18")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), p18: P18): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16, partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially17(p17)", "arrow.core.partially17")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), p17: P17, partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially18(p18)", "arrow.core.partially18")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), p18: P18, partial19: Partial<P19> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially19(p19)", "arrow.core.partially19")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), p19: P19): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16, partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially17(p17)", "arrow.core.partially17")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), p17: P17, partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially18(p18)", "arrow.core.partially18")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), p18: P18, partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially19(p19)", "arrow.core.partially19")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), p19: P19, partial20: Partial<P20> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially20(p20)", "arrow.core.partially20")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), p20: P20): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16, partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially17(p17)", "arrow.core.partially17")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), p17: P17, partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially18(p18)", "arrow.core.partially18")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), p18: P18, partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially19(p19)", "arrow.core.partially19")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), p19: P19, partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially20(p20)", "arrow.core.partially20")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), p20: P20, partial21: Partial<P21> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially21(p21)", "arrow.core.partially21")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), p21: P21): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(p1: P1, partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially2(p2)", "arrow.core.partially2")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), p2: P2, partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially3(p3)", "arrow.core.partially3")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), p3: P3, partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially4(p4)", "arrow.core.partially4")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), p4: P4, partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially5(p5)", "arrow.core.partially5")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), p5: P5, partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially6(p6)", "arrow.core.partially6")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), p6: P6, partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially7(p7)", "arrow.core.partially7")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), p7: P7, partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially8(p8)", "arrow.core.partially8")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), p8: P8, partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially9(p9)", "arrow.core.partially9")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), p9: P9, partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially10(p10)", "arrow.core.partially10")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), p10: P10, partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially11(p11)", "arrow.core.partially11")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), p11: P11, partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially12(p12)", "arrow.core.partially12")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), p12: P12, partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially13(p13)", "arrow.core.partially13")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), p13: P13, partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially14(p14)", "arrow.core.partially14")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), p14: P14, partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially15(p15)", "arrow.core.partially15")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), p15: P15, partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially16(p16)", "arrow.core.partially16")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), p16: P16, partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially17(p17)", "arrow.core.partially17")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), p17: P17, partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially18(p18)", "arrow.core.partially18")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), p18: P18, partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially19(p19)", "arrow.core.partially19")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), p19: P19, partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially20(p20)", "arrow.core.partially20")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), p20: P20, partial21: Partial<P21> = partial(), partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially21(p21)", "arrow.core.partially21")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), p21: P21, partial22: Partial<P22> = partial()): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially22(p22)", "arrow.core.partially22")
)
@Suppress("UNUSED_PARAMETER")
operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).invoke(partial1: Partial<P1> = partial(), partial2: Partial<P2> = partial(), partial3: Partial<P3> = partial(), partial4: Partial<P4> = partial(), partial5: Partial<P5> = partial(), partial6: Partial<P6> = partial(), partial7: Partial<P7> = partial(), partial8: Partial<P8> = partial(), partial9: Partial<P9> = partial(), partial10: Partial<P10> = partial(), partial11: Partial<P11> = partial(), partial12: Partial<P12> = partial(), partial13: Partial<P13> = partial(), partial14: Partial<P14> = partial(), partial15: Partial<P15> = partial(), partial16: Partial<P16> = partial(), partial17: Partial<P17> = partial(), partial18: Partial<P18> = partial(), partial19: Partial<P19> = partial(), partial20: Partial<P20> = partial(), partial21: Partial<P21> = partial(), p22: P22): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

@Deprecated(
  "arrow.syntax.function package is deprecated. Use arrow.core package instead.",
  ReplaceWith("partially1(p1)", "arrow.core.partially1")
)
fun <P1, R> ((P1) -> R).bind(p1: P1): () -> R = partially1(p1)

fun <P1, R> ((P1) -> R).partially1(p1: P1): () -> R = { this(p1) }

fun <P1, P2, R> ((P1, P2) -> R).partially1(p1: P1): (P2) -> R = { p2: P2 -> this(p1, p2) }

fun <P1, P2, R> ((P1, P2) -> R).partially2(p2: P2): (P1) -> R = { p1: P1 -> this(p1, p2) }

fun <P1, P2, P3, R> ((P1, P2, P3) -> R).partially1(p1: P1): (P2, P3) -> R = { p2: P2, p3: P3 -> this(p1, p2, p3) }

fun <P1, P2, P3, R> ((P1, P2, P3) -> R).partially2(p2: P2): (P1, P3) -> R = { p1: P1, p3: P3 -> this(p1, p2, p3) }

fun <P1, P2, P3, R> ((P1, P2, P3) -> R).partially3(p3: P3): (P1, P2) -> R = { p1: P1, p2: P2 -> this(p1, p2, p3) }

fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).partially1(p1: P1): (P2, P3, P4) -> R = { p2: P2, p3: P3, p4: P4 -> this(p1, p2, p3, p4) }

fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).partially2(p2: P2): (P1, P3, P4) -> R = { p1: P1, p3: P3, p4: P4 -> this(p1, p2, p3, p4) }

fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).partially3(p3: P3): (P1, P2, P4) -> R = { p1: P1, p2: P2, p4: P4 -> this(p1, p2, p3, p4) }

fun <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).partially4(p4: P4): (P1, P2, P3) -> R = { p1: P1, p2: P2, p3: P3 -> this(p1, p2, p3, p4) }

fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).partially1(p1: P1): (P2, P3, P4, P5) -> R = { p2: P2, p3: P3, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).partially2(p2: P2): (P1, P3, P4, P5) -> R = { p1: P1, p3: P3, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).partially3(p3: P3): (P1, P2, P4, P5) -> R = { p1: P1, p2: P2, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).partially4(p4: P4): (P1, P2, P3, P5) -> R = { p1: P1, p2: P2, p3: P3, p5: P5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R> ((P1, P2, P3, P4, P5) -> R).partially5(p5: P5): (P1, P2, P3, P4) -> R = { p1: P1, p2: P2, p3: P3, p4: P4 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R> ((P1, P2, P3, P4, P5, P6) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R> ((P1, P2, P3, P4, P5, P6, P7) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R> ((P1, P2, P3, P4, P5, P6, P7, P8) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R).partially17(p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially17(p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R).partially18(p18: P18): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially17(p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially18(p18: P18): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R).partially19(p19: P19): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially17(p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially18(p18: P18): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially19(p19: P19): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R).partially20(p20: P20): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially17(p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially18(p18: P18): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially19(p19: P19): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially20(p20: P20): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R).partially21(p21: P21): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially1(p1: P1): (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially2(p2: P2): (P1, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially3(p3: P3): (P1, P2, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially4(p4: P4): (P1, P2, P3, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially5(p5: P5): (P1, P2, P3, P4, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially6(p6: P6): (P1, P2, P3, P4, P5, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially7(p7: P7): (P1, P2, P3, P4, P5, P6, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially8(p8: P8): (P1, P2, P3, P4, P5, P6, P7, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially9(p9: P9): (P1, P2, P3, P4, P5, P6, P7, P8, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially10(p10: P10): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially11(p11: P11): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially12(p12: P12): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially13(p13: P13): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially14(p14: P14): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P15, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially15(p15: P15): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P16, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially16(p16: P16): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P17, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially17(p17: P17): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P18, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p18: P18, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially18(p18: P18): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P19, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p19: P19, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially19(p19: P19): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P20, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p20: P20, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially20(p20: P20): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P21, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p21: P21, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially21(p21: P21): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P22) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p22: P22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R).partially22(p22: P22): (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R = { p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }
