import filterMap.FilterPeople
import filterMap.FilterResult



fun main() {
    val persons = FilterPeople()
    val peopleResult :FilterResult = persons.filterFun()

    println("All Names : ${peopleResult.names}")
    println("KiÍrva Zárojel nélkül : ${peopleResult.names.joinToString()}")
    println()
    println("Most egymás alá : ${peopleResult.names.joinToString("\n")}")
    println()//uj sor
    println("olderThan25 : ${peopleResult.olderThan25}")
    println()//uj sor
    println("isAnyoneOlderThan30 : ${peopleResult.isAnyoneOlderThan30}")
    println()
}