package builders

fun functions() {
    // function
    fun getLastChar(s: String) = s.charAt(s.length - 1)
    getLastChar("abc")

    // extension function
    fun String.lastChar() = this.charAt(this.length - 1)
    // 'this' can be omitted
    fun String.lastChar2() = charAt(length - 1)
    "abc".lastChar()
}


fun functionLiterals() {
    // anonymous function (lambda)
    val getLastChar = { s: String -> s.charAt(s.length - 1) }
    getLastChar("abc")

}

