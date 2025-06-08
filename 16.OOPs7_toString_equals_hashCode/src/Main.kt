import dataClasses.Point

fun main() {
    val point1 = Point(3,5)
    val point2 = Point(3,5)

    println("Point 1: $point1")
    println("Ponit 2 : $point2")
    println()//uj sor
    println("Are points equals ? :")
    println(point1==point2)//equals
    println()//uj sor
    println("hash code of Point 1 : ${point1.hashCode()}")//hashcode
    println("hash code of Point 2 : ${point2.hashCode()}")

}