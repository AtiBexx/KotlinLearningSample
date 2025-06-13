fun main() {
    val person = Person()
    println(person.name)//itt az érték awesome
    //
    person.name = "John"
    person.age = -5
    println("Name: ${person.name}, Age: ${person.age}")
}