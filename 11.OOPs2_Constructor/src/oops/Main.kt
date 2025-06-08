package oops

fun main() {
    //Példányosítás
    val person1 =Person("John", 25)//osztály meghivva deklarálva person1
    val person2 = Person("Jane", 38)//osztály meghivva deklarálva person2
    //példányosítás2

    val example =Example()
    println()//uj sor
    //példányositás3
    val student1 = Student("Alice", 21)
    val student2 = Student("Kartik", ) //18 lesz automatikusan a kora mert megadtuk aStudent.kt-ban

    student1.displayInfo()
    student2.displayInfo()


    println() //uj sor
    println("${person1.name} is ${person1.age} years old")
    println("${person2.name} is ${person2.age} years old")
}