fun main () {

    val hourOfDay  = 12

    when  {
        hourOfDay < 12 -> println("Good Morning")
        hourOfDay in 12 ..17 -> println("Good Afternoon")
        else -> println("Good Evening")
    }
}