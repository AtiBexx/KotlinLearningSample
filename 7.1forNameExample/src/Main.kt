fun main() {
    val names: List<String> = listOf("Ted", "Billy", "Ryan")//"" külön időzöjelekbe teszed 3 értéknek veszi
    for (allNames: String in names) { //in végig iterálja az összes nevet tehát végigmegy rajta
        println("Hello $allNames")
    }
        println()//uj sor
        newname()//függvényhívás
        println()//uj sor
        newName2()

}
//vagy
fun newname(){
    val names :List<String> = listOf("Ted", "Billy", "Ryan")
    names.forEach {
        println("Hello $it")
    }
}
//vagy
fun newName2(){
    val names :List<String> = listOf("Ted", "Billy", "Ryan")
    names.forEach { name ->
        println("Hello $name")
    }
}
/*Külön minden névhez odaÍrja hogy hello*/