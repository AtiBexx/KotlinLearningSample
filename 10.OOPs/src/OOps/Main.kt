package OOps

fun main() {
    //Példányosítás
    val person1 =Person()//osztály meghivva deklarálva person1
    val person2 = Person()//osztály meghivva deklarálva person2

    person1.name="John"
    person1.age=25

    person2.name= "Jane"
    person2.age=38

    println("${person1.name} is ${person1.age} years old")
    println("${person2.name} is ${person2.age} years old")
}