package builders

fun buildStringExample1(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Numbers: ")
    for (i in 1..10) {
        // 'this' can be omitted
        stringBuilder.append(i)
    }
    return stringBuilder.toString()
}

fun buildStringExample2(): String {
    return doBuildString {
        this.append("Numbers: ")
        for (i in 1..10) {
            // 'this' can be omitted
            append(i)
        }
    }
}



fun doBuildString(build: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.build()
    return stringBuilder.toString()
}





fun buildString(): String {
    val stringBuilder = StringBuilder()
    with (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
    return stringBuilder.toString()
}