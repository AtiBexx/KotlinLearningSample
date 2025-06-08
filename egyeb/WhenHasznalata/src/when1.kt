val allapot = 85

fun main() {
    val eredmeny = when (allapot) {
        100 -> "Tökéletes állapot!"
        in 90..99 -> "kis karcolás."
        in 75..89 -> "néhány látszolagos sérülés."
        in 50..74 -> "gyenge kondició."
        in 25..50 -> "nagyon gyenge kondició"
        else -> "nagyon gyengénél is gyengébb kodició."
    }
    println("az állapot $eredmeny")
}
//output mivel 85 ezért
//az állapot néhány látszolagos sérülés.
/*a when kifejezes in 80..100 //80 tól 100
-ig ha komment kell mellé akkor -> ez a nyil + ""
in 90..99 → tartomány (range) ellenőrzés
 */
/*
A -> egy kifejezés-nyíl, amely azt jelzi, hogy mit csináljon
 az adott feltétel esetén.
Az in 90..99 pedig a tartományellenőrzés (range check).
A .. a zárt tartomány operátor, azaz beleértve a szélsőértékeket is.
Komment: // (egy soros) vagy /* ... */ (többsoros)
A when olyan, mint a switch más nyelvekben, csak sokkal erősebb és rugalmasabb.
 */

