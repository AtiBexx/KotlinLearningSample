class FriendList {
    fun friendList() { //Top up függvény
        val bestFriends :ArrayList<String> = arrayListOf("ryan")
        var bestFriendInput: String? //? elvis az értéke lehet null is
        var deleteBestFriendsInput: String?
        var chooseMenu: String?

        while (true) {
            //menü kiíratása
            println("\nChoose an option:")
            println("1. Add friend to list") // Elírás javítva és szöveg egyszerűsítve
            println("2. Delete Best Friend from list")
            println("3. View friend list")
            println("4. Exit")
            print("Enter your choice: ")
            chooseMenu = readlnOrNull() // Beolvasás a cikluson bel
            //ugrás a menüre switch case a javában
            //itt nincs szügség a break-re mindig:
            when (chooseMenu) {
                "1" -> {
                    println("Add to the list : ")
                    bestFriendInput = readlnOrNull()
                    if (!bestFriendInput.isNullOrBlank()) {
                        bestFriends.add(bestFriendInput)
                        println("$bestFriendInput - added to the list. ")
                        println(bestFriends.joinToString("\n"))
                    } else {
                        println("cannot add to the list")
                    }
                }
                "2" -> {
                    print("Name of Best Friend to delete: ")
                    deleteBestFriendsInput = readlnOrNull()
                    if (!deleteBestFriendsInput.isNullOrBlank()) {
                        if (bestFriends.remove(deleteBestFriendsInput)) {
                            println("$deleteBestFriendsInput removed.")
                        } else {
                            println("$deleteBestFriendsInput not found.")
                        }
                    } else {
                        println("Name to delete cannot be empty.")
                    }
                }

                "3" -> {
                    //println(bestFriends.joinToString("\n"))
                    //vagy for lista
                    for (friend: String in bestFriends)
                        println(friend)
                }

                "4" -> {
                    println("Exiting program")
                    break //kilépés a while ciklusbol
                    //System.exit(0)
                }
                else -> {
                    println("Invalid choice. Please select from 1 to 4.")
                }
            }//when vége
        }//while vége
    }
}
        fun main() {
            val friendListManager = FriendList()
            friendListManager.friendList()
        }


