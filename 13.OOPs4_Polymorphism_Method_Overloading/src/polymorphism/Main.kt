package polymorphism

fun main() {

    val mathOps=MathOperations()
    val resultInt:Int=mathOps.add(1,2)
    val resultDouble:Double=mathOps.add(3.5,5.6)
    val resultStrings:String=mathOps.add("cool","Hacking")

    println("Result (INT) : $resultInt")
    println("Result (Double) : $resultDouble")
    println("Result (String) : $resultStrings")
}