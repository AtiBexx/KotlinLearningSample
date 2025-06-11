fun main() {
    val names: List<String> = listOf("Ted", "Billy", "Ryan")//"" külön időzöjelekbe teszed 3 értéknek veszi
    val repeatTimes = 4
    for (loop :Int in 1.. repeatTimes){ //loop lehet i -is
        //for (loop in 1..4) akkor nem kénne változo
        for (allNames: String in names) run { //in végig iterálja az összes nevet tehát végigmegy rajta
            println("Hello $allNames")
        }
    }
}