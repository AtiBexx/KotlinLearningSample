enum class Animal(val sound: String) {
    DOG("Woof"),
    CAT("Meow"),
    COW("Moo");

    fun speak() {
        println("The $name says $sound")
    }
}

fun main() {
    Animal.DOG.speak() // The DOG says Woof
}
