class ifElse2 {

    val number1 :Int = 15
    val number2 :Int = 20

    val maxNum :Int = if (number1 > number2) number1 else number2
    //ha a num2 nagyobb visszaadom a num2 értékét
    //ha az egy nagyobb akkor az egynnek az értéke

}
fun main(){

    val IfElse = ifElse2()
    println("maxNum is: ${IfElse.maxNum}")
}