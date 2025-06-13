fun main() {
    val bestFriends:ArrayList<String> = arrayListOf("Ryan","Emma")
    println("What is your BestFriends?")

    val bestfriendInput:String? = readlnOrNull()
    if (bestfriendInput != null) {
        bestFriends.add(bestfriendInput)
    }
    for (friend :String? in bestFriends){
        println(friend)
    }
}