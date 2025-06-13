fun main (){
    //példáníosítások
    val bestFriends = arrayListOf("ryan")
    var bestFriendInput: String =""
    var deleteBestFriendsInput : String =""
    var optionPicked : String =""

    while (optionPicked != "3") {
        println("1.Add friedns to list.")
        println("2.Delete Best Friends to list.")
        println("3.Exit")
        print("Choose an option: ")
        optionPicked = readLine() ?:""

        if (optionPicked == "1"){
            bestFriendInput ="placeholder"
            while (bestFriendInput.isNotBlank()){
                print("What's your BestFriends?: ")
                bestFriendInput = readLine() ?:""
                if (bestFriendInput.isNotBlank()){
                    bestFriends.add(bestFriendInput)
                }
            }
            println("Your Best Friends are: ")
            for (friend in bestFriends){
                println(friend)
            }
        }else if (optionPicked == "2"){
            println("Name of Best Friend to delete: ")
            deleteBestFriendsInput = readLine() ?:""
            if (bestFriends.remove(deleteBestFriendsInput)){
                println("$deleteBestFriendsInput removed.")
            }else{
                println("$deleteBestFriendsInput not found.")
            }
        }else if  (optionPicked == "3") {
            println("Exiting program")
            break
            //System.exit(0)
        }else {
            println("Invalid option")
        }
        println()//üres sor
    }



}