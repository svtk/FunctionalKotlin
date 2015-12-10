package extensions

import model.*

fun String.lastChar() = this.get(this.length - 1)
//'this' can be omitted
fun String.lastChar1() = get(length - 1)

fun test() {
    //visible in completion
    "abc".lastChar()
}

//improving existing api, avoid dirty traits
fun Student.isAdult() = age != null && age > 21
