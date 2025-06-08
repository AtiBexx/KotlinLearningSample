fun main(args: Array<String>) {

    val nev = "Madrigal"
    val eleteroPont = 89
    val aldott = true // boolean
    val halhatatlan = false //boolean
    //Aura
    val auraLathatosag = aldott && eleteroPont > 50 || halhatatlan
    val auraSzin = if (auraLathatosag) "zöld" else "semmi"

    val egeszsegStatus = when (eleteroPont) {
        100 ->"Tőkéletes"
        in 90.. 99 -> "jó"
       in 75..89 -> if (aldott){
         "Vannak rajta kisebb sérülések, de gyorsan gyógyulnak"
       }else{
           "vannak rajta kisebb sérülések"
       }
        in 15 .. 74 -> "nem jól néz ki"
        else -> "Rossz kondició"
    }
    //játékos státusz
    println("Aura: $auraSzin Áldott: ${if (aldott) "igen" else "nem"}")
    println("$nev ($eleteroPont HP) - $egeszsegStatus")
}





/*
Java:
switch (szam) {
    case 1: System.out.println("Egy"); break;
    case 2: System.out.println("Kettő"); break;
    default: System.out.println("Más"); break;
}
kotlin
when (szam) {
    1 -> println("Egy")
    2 -> println("Kettő")
    else -> println("Más")  // ← ez felel meg a default-nak!
}
 */