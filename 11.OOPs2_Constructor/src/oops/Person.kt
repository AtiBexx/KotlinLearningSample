package oops

class Person(val name:String, val age :Int)
// vagy class Person(val name: String, val age: Int) konstruktor hozzáadása
//es a main fajlban akkor val person1 = Person("John", 25)
//val person2 = Person("Jane", 38)
//vagy data class
//data class Person(val name: String, val age: Int)
//A main fajlban println(person1) // automatikusan: Person(name=John, age=25)
