//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    var age: Int = 25
    var weight: Double = 65.5
    var isStudent: Boolean = false
    var grade : Char = 'b'
    var numbers : List<Int> = listOf(1, 2, 3, 4, 5, 6 )
    //nullable
    var nullableName : String? = null
    var name : String? = "Ati"

    val pi :Double = 3.14
    println("$age\n$weight\n$isStudent\n$grade\n$nullableName\n$numbers")
    println("${name?.length}")//kiirjuk a név hosszát
    /*A nullable típusoknál mindig kötelezö a? kiteni
    ha a println("${name?.length}") nem tenném ki akkor a ? a
    name után akkor hibát dobna a fordito
     */
}


