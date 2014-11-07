package defaultValues

fun foo(number: Int = 42, char: Char = '•') {
    for (i in 0..number) {
        print(char)
    }
    println()
}

fun printStrange() {
    foo()
    foo(21, '#')
    foo(3)
    foo(char = '^')
    foo(number = 11, char = '∞')
}

fun main(args: Array<String>) {
    printStrange()
}