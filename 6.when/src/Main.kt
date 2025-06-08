fun main() {
   //manuálisan megadtuk neki a napot
    val day : String = "Monday"
//ez a javabán a switch case finally
    when(day) {
        "Monday" -> println("It's the start of the week.")
        "Friday","Saturday" -> println("Weekend is here.")
        else -> println("It's a regular day.")
    }
}