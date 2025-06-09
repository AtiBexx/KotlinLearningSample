fun main() {

    while (true) {
        print("What's yout level of pain between 1 and 3 ? :")

        //val number: Int = readLine()!!.toInt()//!! nem lehet null
        val number: Int? = readlnOrNull()?.toIntOrNull()
        if (number == null) {
            println("Hiba kérlek egy számot adj meg")
            continue // újra kérdezi
        } else {

            when (number) {
                1 -> println("You will be okay.")
                2 -> println("Are you okay?")
                3 -> println("You are cool.")
                else -> {
                    println("Please choose a number between 1 and 3.")
                    continue // újra kérdezi
                }

            }
        }
        break//ha 1-3 között van kilép a ciklusból
    }
}