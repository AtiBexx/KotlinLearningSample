package passingFunctionAsParameters

fun main() {

    val resultSquare= executeOperation(5,::square)
    val resultDouble= executeOperation(7,::square)

    println("Square Result : $resultSquare")
    println("Double Result : $resultDouble")


}

fun executeOperation(value:Int, operation : (Int) -> Int) :Int{
    return operation(value)
}
fun  square(x:Int) :Int{
    return x*2
}