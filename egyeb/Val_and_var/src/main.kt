object maxPontszam{
    const val Max_TapasztalatiPont = 5000
}

const val MAX_EXPERIENCE = 5000
//csak függvényen kivül vagy osztályon belül engedi

fun main(args: Array<String>) { //fő main ciklus
    val MTP = maxPontszam //példányosítottuk az osztályt
    MTP.Max_TapasztalatiPont//példányositottuk a pontott

    val playerName = "Estragon"
    var tapasztalatiPontszám = 5
    tapasztalatiPontszám += 5
    println(tapasztalatiPontszám)
    println(playerName)
    println("A játékos neve: $playerName \nés a pontszáma: $tapasztalatiPontszám")
}

//fun main(args: Array<String>) ez ugyanaz mint a javában
//a public static voidn main(String args[]) {}
