package filterMap

class FilterPeople {
    fun filterFun(): FilterResult {
        val people:List<Person> = listOf(
            Person("Alice",25),
            Person("Bob",30),
            Person("Charlie",22),
            Person("David",35),
            Person("Eva",28),
        )
        val olderThan25 :List<Person> = people.filter { it.age>25 }// a 25 év alatiakat kiszürjük eltávolitjuk
        val names :List<String> = people.map { it.name }//nevek kiirasa
        val isAnyoneOlderThan30=people.any { it.age>30 }
        return FilterResult(
            olderThan25 = olderThan25,
            names = names,
            isAnyoneOlderThan30 = isAnyoneOlderThan30
        )
    }
}
