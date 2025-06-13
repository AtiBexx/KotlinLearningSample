import Calendar


enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun main() {
    val today = Day.FRIDAY

    //enum meghivása
    val enumday = Calendar()
    for (days in Calendar.Day2.entries){
        println("${days.name} : ${days.message()}")
    }
    println()

    when (today) {
        Day.MONDAY -> println("Hétfő van!")
        Day.FRIDAY -> println("Péntek van, majdnem hétvége!")
        Day.SATURDAY, Day.SUNDAY -> println("Hétvége!")
        else -> println("Munkanap.")
    }
}
