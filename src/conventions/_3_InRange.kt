package conventions


interface Container<E> {
    operator fun contains(element: E): Boolean
}

fun inConvention(container: Container<String>) {
    "a" in container
    // compiles to
    container.contains("a")
}

fun numericalRange(i: Int, c: Char) {
    //'..' resolves to 'rangeTo' function
    if (i in 1..10) {}

    if (c in 'a'..'z') {}
}

fun stringRange(s: String) {
    if (s in "island".."isle") {}
}