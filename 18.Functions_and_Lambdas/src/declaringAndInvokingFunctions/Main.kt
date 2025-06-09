package declaringAndInvokingFunctions

fun greet(name : String){
    println("Hello $name")
}

fun main() {
    //példányosítás
    val calculate =Calculate()
    val person = Person()
    val sumResult = calculate.calculatesum(5,7)//összegEredmény , összeg sumResult
    val productResult =calculate.multiply(4,6)//szorzateredmény



    greet("Kotlin Learners")
    println()//uj sor
    println("sum result : $sumResult ")
    println()
    println("Product : $productResult")
    println()
    person.greatPerson("Alice", "Hi")
    }






