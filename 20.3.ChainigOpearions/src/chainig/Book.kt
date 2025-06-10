package chainig

class Book {
    fun chainingFlatMap(): bookResult {
        val books= listOf(
            dataBook("Kotlin in action", listOf("Dimitry Jemrov","Svetlana Isakova")),
            dataBook("Effective Java", listOf("Joshua Bloch")),
            dataBook("Clean Code", listOf( "Dimitry Jemerow","Svetlana Isakova"))
        )
        val distinctAuthors=books.flatMap { it.authors }.distinct()

        return bookResult(
            distinctAuthors = distinctAuthors,
            books = books
        )
    }
}