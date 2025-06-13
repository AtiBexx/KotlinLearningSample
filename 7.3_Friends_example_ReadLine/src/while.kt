fun main() {
    val bestFriends: ArrayList<String> = arrayListOf("Ryan", "Emma")
    var bestfriendInput = "Nothing"
    while (bestfriendInput != "") {
        println("What is your BestFriends?")
        bestfriendInput = readlnOrNull()!!
        bestFriends.add(bestfriendInput)
        for (friend: String? in bestFriends) {
            println(friend)
        }
    }
}