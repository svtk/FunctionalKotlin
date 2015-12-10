package conventions

fun infixNotation() {
    infix fun Int.foo(s: String) = "$s$this"

    1 foo "abc"
    // the same as:
    1.foo("abc")
}

interface A {
    operator fun plus(a: A): A
    operator fun times(a: A): A
    operator fun not(): A
}

fun use(a1: A, a2: A) {
    a1 + a2
    a1 * a2
    !a1
}