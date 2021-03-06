@file:JvmName("Composition")

package arrow.core

import kotlin.jvm.JvmName

expect infix fun <P1, P2, IP, R> ((P1, P2) -> IP).andThen(f: (IP) -> R): (P1, P2) -> R
expect infix fun <IP, R> (() -> IP).andThen(f: (IP) -> R): () -> R
expect infix fun <P1, IP, R> ((P1) -> IP).andThen(f: (IP) -> R): (P1) -> R
expect infix fun <IP, R, P1> ((IP) -> R).compose(f: (P1) -> IP): (P1) -> R
