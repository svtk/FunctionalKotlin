package conventions

import kotlin.jvm.internal.Intrinsics

fun compareStrings(s1: String?, s2: String?) {
    s1 == s2
    // is compiled to
    Intrinsics.areEqual(s1, s2)
}

interface B {
    operator fun compareTo(other: B): Int
}

fun test(b1: B, b2: B) {
    b1 < b2
    // is compiled to
    b1.compareTo(b2) < 0

    b1 >= b2
    // is compiled to
    b1.compareTo(b2) >= 0
}