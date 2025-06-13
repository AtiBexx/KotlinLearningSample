
fun main() {
    val bestFriends: ArrayList<String?> = arrayListOf("Ryan", "Emma")
    while (true) {
        println("What is your BestFriends?")

        val bestfriendInput: String? = readlnOrNull()
        if (bestfriendInput == null) {
            //println(bestFriends.joinToString("\n"))
        } else if (bestfriendInput.lowercase() == "exit") {
            break
        } else if (bestfriendInput.isBlank()){//Enter probléma uj sor amit az ide add hozzá megoldva
            //isBlank() azt ellenőrzi, hogy a felhasználó csak üresen vagy szóközökkel nyomott-e
            println(bestFriends.joinToString("\n"))
            continue
        }
        else {
            bestFriends.add(bestfriendInput)
            println(bestFriends.joinToString("\n"))
        }

        /*for (friend: String? in bestFriends) { //ezzel is soronként irjuk ki
            println(friend)
        }*/
    }
}
