object maximalisTapasztalat {// a const nem alkalmazható osztályon kívül csak objectként
    const val MAX_Tapasztalat = 5000 //const nem változtatható mint a val teljesen fix
}
fun main(args: Array<String>){ //argumentum bekérésre használjuk de itt most nem szügséges
    val jatekosNev = "Estragon"

    var tapasztalatiPont = 5
    tapasztalatiPont += 5 //hozzáadjuk a pontszámhoz
    tapasztalatiPont += 5000

    if (tapasztalatiPont > maximalisTapasztalat.MAX_Tapasztalat){
       tapasztalatiPont = maximalisTapasztalat.MAX_Tapasztalat
    //Deklaráljuk az if metódusal hogy nem lépheti át a max tapasztalatott a pontszám
    }

    println("Tapasztalati pontszám: $tapasztalatiPont")
    //kiirjuk a változokat
    println("a játékos neve: $jatekosNev")
}