package conventions

fun infixNotation() {
    fun Int.foo(s: String) = "$s$this"

    1 foo "abc"
    // the same as:
    1.foo("abc")
}

trait A {
    fun plus(a: A): A
    fun times(a: A): A
    fun not(): A
}

fun use(a1: A, a2: A) {
    a1 + a2
    a1 * a2
    !a1
}