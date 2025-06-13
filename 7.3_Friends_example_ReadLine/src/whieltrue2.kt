
fun main() {
    val bestFriends: ArrayList<String?> = arrayListOf("Ryan", "Emma")
    while (true) {
        println("What is your BestFriends?")

        val bestfriendInput: String? = readlnOrNull()
        if (bestfriendInput == null) {

        } else if (bestfriendInput.lowercase() == "exit") {
            break
        }  else if (bestfriendInput.isBlank()){ //isNullorBlank
        } else {
            bestFriends.add(bestfriendInput)
        }
     for (friend: String? in bestFriends) { //ezzel is soronként irjuk ki
            println(friend)
        }
    }
}
