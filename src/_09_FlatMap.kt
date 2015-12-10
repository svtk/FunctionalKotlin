package flatMap

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("1984", listOf("George Orwell")),
            Book("Catch-22", listOf("Joseph Heller")))
    val authors = books.flatMap { it.authors }.toSet()
    println(authors)


    val list = listOf("abc", "def")
    println(list.flatMap { it.toList() })
}