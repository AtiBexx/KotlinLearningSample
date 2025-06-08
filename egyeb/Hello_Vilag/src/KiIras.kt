class KiIras { //másik osztály
    fun kiIr() {
        println("Hello Word !")
    }
}
class kiIras2(val szöveg : String) { //másik osztály paraméterekel
    fun kiIr2() {
        println(szöveg)
    }
}

fun main(){ //fő osztály
    val kiiras = KiIras() //Deklarálva az osztály
    val kiiras2 = kiIras2("Egy egyszerü Szöveg !") //Deklarálva plusz hozzáadva
    kiiras.kiIr() //elinditva meghívva a konstruktor
    kiiras2.kiIr2()
}