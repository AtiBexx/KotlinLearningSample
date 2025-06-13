fun main(){
    val bestFriends: ArrayList<String> = arrayListOf("Ryan", "Emma")
    println("Who is your best friend?")

    readlnOrNull()?.let { bestFriends.add(it) }

    bestFriends.forEach { println(it) }

}
