import java.util.*

class cool {
    fun basicWhileLoop() {
        var count = 0
        while (count < 5) {
            println("Count : $count")
            count++ //itt növelni kell az értéket egyel
        }
    }

    fun infinityWhileLoop() {
        var x = 1
        while (true) { //végtelen for loop Kotlinban csak ez van
            println("Value is x : $x")
            x++ //it is növelni kell
            //x=+ 2 //akkor 2 vel növelnénk
            //kilépés a végtelen ciklusbol
            if (x > 10) {
                break
            }
        }
    }
    fun loopWidthUserInput() {
        val scanner = Scanner(System.`in`) //vagy String.in
        var userInput: String

        while (true) {
            println("Enter a word(or 'Exit' to quit): ")
            userInput = scanner.nextLine()
            if (userInput.toLowerCase() == "exit") {//lowercase az uj kotlinfüggvény azzal kelenne de ezzel is müködik
                break
            }

            println("Your entered : $userInput ")
        }
    }
    fun loopWidthConditionAtEnd(){
        var countdown=5
        while (countdown > 0){
            println("Countdown : $countdown")
            countdown-- //csökkentem
        }
    }
    fun MatrixWhile(){
            var row = 1 //row jelentése sor
            while (row <= 4) {            // sorok száma
                var count = 1 //count darabszám számláló
                while (count <= row) {    // adott sorban hány "Ati"
                    print("Ati")
                    count++
                }
                println()                 // új sor
                row++
            }
        }
    fun MatrixWhile2(){
        var row = 4
        while (row >= 1) {            // sorok száma
            var count = 1
            while (count <= row) {    // adott sorban hány "Ati"
                print("Ati")
                count++
            }
            println()                 // új sor
            row--
        }
    }
    }


