package conventions


fun iterateOverCollection(collection: Collection<Int>) {
    for (element in collection) {}
}

fun iterateOverString() {
    //You can iterate over anything that has a method 'iterator', member or extension.
    for (c in "abcd") {}
    "abcd".iterator() //library extension method
}