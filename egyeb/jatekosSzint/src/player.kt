class player { //kontruktor
    fun Udvozles() {
        println("Üdvözöllek a Játékban !")
    }
}
fun main(){
    val jatekos = player()
    jatekos.Udvozles()
    var playerLevel : Int = 4 //: Int megadtuk neki hogy számot fogadthat el csak
    val heroname : String ="Estregon"
    println("A hős ($heroname) elindul útjára, hogy megtalálja az elvarázsolt kardot.")
    //playerLevel += 1 vagy alatta

    playerLevel ++
    println("a játékos szintje : $playerLevel")
    println()
}