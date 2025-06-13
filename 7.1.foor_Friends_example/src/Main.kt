fun main() {

    val bestFriends :ArrayList<String>  = arrayListOf("Ryan", "Ted", "Jan", "Dylan")
    val filtered:List<String> = bestFriends.filter { it.startsWith("D")}
        //csak a D betüs neveket szürjük ki
    bestFriends.add(1, "Mike")// a listában a helyét állítom be az indexel
    //de mivel 1 második lesz mert nullától kezdödik az index is !
    bestFriends.addAll(listOf("Niki","Dennis"))//itt több nevet adok hozzá
    for (friends :String in bestFriends){
        println(friends)
    }
    println(bestFriends.joinToString())// eltüntewtjük a zárójelet
    println("Delete Mike : ${bestFriends.remove("Mike")}") //kitöröljük Mike-ot
    println("Kitöröljük az első indexet ami 0 : ${bestFriends.removeAt(0)}")
    println()//uj sor
    println(bestFriends.contains("Dylan")) //Boolean megneézük a listában van -e Dylan
    print(bestFriends.indexOf("Dylan"))
    print(" helyen van : (megnézük hanyadik helyen van Dylan)\n")
    bestFriends.sort()//Név szerint csökkenö
    println("Rendezett lista (növekvő): ${bestFriends.joinToString()}")
    bestFriends.sortDescending()
    println("Rendezett lista (csökkenő): ${bestFriends.joinToString()}")
    println(filtered.joinToString())
    println(bestFriends.lastIndexOf("Dylan")) // utolsó előfordulás indexe (ha többször van)
    bestFriends.clear()
    println("Lista törölve :$bestFriends ")
    println("Lekérem hogy a lista üres -e :${bestFriends.isEmpty()}")
}


