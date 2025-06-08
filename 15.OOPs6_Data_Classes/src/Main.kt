import dataClasses.Book
import dataClasses.Person

fun main() {
    //példányosítás
    val person = Person("Alice", 25)

    println("Name : ${person.name}")
    println("Age : ${person.age}")

    println("person details : $person")
    //tooStringel
    println("person details : ${person.toString()}")
    println()//uj sor
    println("Book_Info:")
    //pédányosítás
    val book = Book("Kotlin in action","Dimitry Jemerov", 2017)
    val updateBook = book.copy(year = 2022)
    val (title , author, year) = updateBook

    println("Original book : $book")
    println("Updated book : $updateBook")

    println("Desctructing - Title : $title, Author : $author, Year : $year")
}