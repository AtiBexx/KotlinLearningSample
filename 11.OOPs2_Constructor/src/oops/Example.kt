package oops

class Example {
    init {
        println("Initialization Block 1")
    }
    val name :String="Kotlin"

    init {
        println("Initialization Block 2")
        println("Name : $name")
    }
}