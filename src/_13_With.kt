package with

fun getAlphabetInString(): String {
    val sb = StringBuilder()
    with (sb) {
        this.append("Alphabet: ")
        for (ch in 'a'..'z') {
            append(ch)
        }
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println(getAlphabetInString())
}