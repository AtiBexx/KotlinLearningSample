class IfAndElse {
    // A hős neve
    fun getPlayerName(): String {
        return "Madrigal"
    }
}

fun main() {
    val jatekos = IfAndElse() // Hős példányosítása
    val jatekosNev = jatekos.getPlayerName() // Hős neve
    println("A hős bejelenti a jelenlétét a világnak: $jatekosNev")

    var jatekosSzint = 4
    println("A játékos szintje: $jatekosSzint")

    // Ha a szint 1, egy üzenetet írunk ki, ha nem, másikat
    if (jatekosSzint == 4) {
        println("Találkozz Buborékok Úrral a puha dolgok földjén.")
        ++jatekosSzint
        ++jatekosSzint
        println(jatekosSzint)
    } else if (jatekosSzint ==6) { // nem fog lefutni mivel az if lefutott
        println("Keresd meg az elvarázsolt kardot!")
    }else   {
        // A hős elindul
        println("A hős útra kel, hogy megtalálja az elvarázsolt kardot.")
        jatekosSzint +=4 //növeljük 4 es szintel az összeget
    }
    println("Telik az idő...")

    // A hős visszatér
    println("A hős visszatér a küldetéséből.")

    // Növeljük a szintet
    jatekosSzint += 1
    println("A hős szintje most: $jatekosSzint")
}
