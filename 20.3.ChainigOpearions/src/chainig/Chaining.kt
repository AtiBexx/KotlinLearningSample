package chainig


//top up függvények
fun chainingMap(): List<String> {
    val persons= listOf(

        Person("Alice",25),
        Person("Bob", 30),
        Person("Charlie", 22),
        Person("David", 35),
        Person("Eva", 28)
    )
    return persons.filter { it.age>25 }.map { it.name }
}

fun main(){
val book = Book()
val result :bookResult = book.chainingFlatMap()
    val namesOlderThan25 :List<String> = chainingMap()

    val product: Double = Product().allProduct().totalPriceAfterDiscount
    val allProduct = Product().allProduct().products.joinToString("\n"){"${it.name} - ${it.Price} $"}
    println("This is all product : \n$allProduct")
    println("The Total is : $product $ dollar.")
    println()
    println(result.books.joinToString("\n"))
    println()
    println(result.distinctAuthors)
    println()
    println("Names of person older than 25: $namesOlderThan25")

}
