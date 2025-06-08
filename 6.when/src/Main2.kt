
fun main(args : Array<String>) {

    var score : Int = 75

    when (score)  {
        in 98.. 100 -> println("Excellent.")
        //zárt tartomány in 1..5 akkor ez azt jelenti hogy 1-5-ig.
        in 70 until 98 -> println("Good job !")
        //félig nyitott tartomány in 1 until 5 ami azt jelenti 1-4-ig az 5 kimarad
        //!in ha nincs benne a tartományba
        !in 0 until 40 -> println("Almost Good!")
        //tehát 0 - 39-ig az else ág hajtodik végre
        else -> println("Keep Learning.")
    }
}