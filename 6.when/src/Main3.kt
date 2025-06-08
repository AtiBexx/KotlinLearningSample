fun printType(value : Any, value2 :Any) {
    //(value :Any) bármilyen typusó lehet a változó
    when {
        //Konkrétebb feltételeket írj felülre, az általánosakat (mint value is String) alulra.
        //Külömben nem fog müködni mert ha az első ágat megvizsgálta akkor  nem megy tovább a többi ágra ha
        //az egyik igaz.
       value is String && value2 is Int -> println("Ez egy szöveg és egy Int típus")
       value is String && value2 is Double -> println("Ez egy szöveg és egy Double típus")
       value is String -> println("Ez egy szöveg.")
       value is Int -> println("Ez egy egész szám.")
       value is Double -> println("Ez egy lebegőpontos szám.")
       else -> println("Ismeretlen típus.")
    }
}
//az is-el lekérjük az értékek típusát
fun main() {
    printType("Ati","")      // Ez egy szöveg.
    printType(75 ,"")         // Ez egy egész szám.
    printType(3.14,"" )       // Ez egy lebegőpontos szám.
    printType(value = "cool" , value2 = 15)
    printType(value = "Cp" , value2 = 65.5)
}
