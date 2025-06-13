class Dog(var name: String) {

    fun rename(name: String) {
        println("Paraméter neve: $name")          // a paraméter neve
        println("Eredeti példányváltozó neve: ${this.name}") // az osztálypéldány változója

        this.name = name  // így mondod meg: "a példány változóját állítsd be a paraméter értékére"
        //ez kell mert ez nélkül nem változtatja meg a nevet
    }
}

fun main() {
    val dog = Dog("Buddy")
    println("Eredeti név: ${dog.name}") // Buddy
    //rename függvény nincs alapból a kotlinban
    println()//uj sor
    dog.rename("Max")
    println("Új név: ${dog.name}")      // Max
}
