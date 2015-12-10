package zip

import model.Person

data class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val friends = listOf(Person("Alice", 29), Person("Bob", 31))
    val books = listOf(Book("1984", listOf("George Orwell")),
            Book("Catch-22", listOf("Joseph Heller")))
    println(friends.zip(books))
}