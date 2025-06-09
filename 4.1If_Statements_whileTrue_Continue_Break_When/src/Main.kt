fun main() {

    while (true) {
        print("What's yout level of pain between 1 and 3 ? :")

        //val number: Int = readLine()!!.toInt()//!! nem lehet null
        val number: Int? = readlnOrNull()?.toIntOrNull()
        if (number == null) {
            println("Hiba kérlek egy számot adj meg")
            continue // újra kérdezi
        } else {

            if (number == 1) {
                println("you will be okay")
            } else if (number == 2) {
                println("Are you okay")
            } else if (number == 3) {
                println("You are so cool")
            } else {
                println("Please you choose to 1-3")
                continue // újra kérdezi
            }
        }
        break//ha 1-3 között van kilép a ciklusból
    }
}