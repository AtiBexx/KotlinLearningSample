import java.util.Scanner

class userN {
    fun inputUser(){
        val scanner = Scanner(System.`in`)
        var userInput : String

        while (true) {
            println("Enter a word(or 'Exit' to quit): ")
            userInput = scanner.nextLine()
            if (userInput.lowercase() == "exit") {
                break
            }
            println("Your entered : $userInput ")
        }
    }
}
