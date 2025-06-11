package nullable

import nullable.nullable.NullableValues
import nullable.nullable.elvisValue
import nullable.nullable.safeCallValues

fun main() {
    val nullableObj = Nullable()
    val result: NullableValues = nullableObj.nullableTypes()
    val lenghtResult :safeCallValues = nullableObj.safeCall()
    val elvisLenghtResult: elvisValue =nullableObj.elvisOperation()
    println("Original: ${result.originalValue}")
    println("Updated: ${result.updatedValue}")
    println()//uj sor
    println("Lenght of text : ${lenghtResult.lenght}")//eredmény = null
    println()//uj sor
    println("Lenght of name : ${elvisLenghtResult.elvisLenght}")
    println()//uj sor
    print("Top up függvény Kiírása :")
    SafeCasting()

}
fun SafeCasting(){
    val text : Any = "Hello, World!"
    // val text : Any = 3456 //akkor a Lenght of the name : null lesz
    val lenghtText : Int? =(text as? String)?.length
    println("Lenght of the name: $lenghtText")
}