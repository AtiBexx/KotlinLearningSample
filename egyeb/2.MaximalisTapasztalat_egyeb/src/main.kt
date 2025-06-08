fun main(args:Array<String>) {
    val nev = "Madrigal"
    var eleteroPont = 89
    val szentelt = true
    val halhatatlan = false

    //Aura
    val auraColor = auraColor(szentelt, eleteroPont, halhatatlan)

    val egeszsegStatus = egeszsegugyiAllapot(eleteroPont, szentelt)
    //jatekos statusz
    printJatekosStatusz(auraColor, szentelt,nev, egeszsegStatus)
    tuzGolyo()
}
//egezsegugyi allapot osztaly
private fun egeszsegugyiAllapot(eleteroPont: Int, szentelt: Boolean) =
    when (eleteroPont) {
        100 -> "Tőkéletes kondició"
        in  90..99 -> "néhány karcolás"
        in 75..89 -> if (szentelt) {
            "vannak rajta apróbb sérülések, de elég gyorsan gyógyulnak"
        }else{
            "néhány sérülés"
        }
        in 15..74 -> "látszik néhány sérülés de nem vészes"
        else -> "szörnyű állapotban van"
    }
//JatekosStatuszOsztaly
private fun printJatekosStatusz(auraColor: String, szentelt: Boolean,
                                nev : String,egeszsegugyiAllapot: String){
    println("(Aura: $auraColor) +" +
            "(Áldott: ${if (szentelt) "igen" else "nem"})")
    println("$nev $egeszsegugyiAllapot")
}
private fun auraColor(szentelt: Boolean,
                      eleteroPont: Int,
                      halhatatlan: Boolean): String {
    val auraLathatosag = szentelt && eleteroPont > 50 || halhatatlan
    val auraColor = if (auraLathatosag) "Zöld" else "Nincs"
    return auraColor
}
private fun tuzGolyo(szamTuzgolyo: Int = 2) =
    println("Egy pohár tűzgolyó születik. (x$szamTuzgolyo)")

/*
A Kotlinban **valóban nem mindegy**, milyen **sorrendben adod át az argumentumokat** egy függvénynek – **főleg,
ha azoknak alapértelmezett értékeik is vannak** vagy **ugyanolyan típusúak** (pl. több `Boolean` vagy több `Int`).

Miért számít a sorrend Kotlinban?
A Kotlin **pozíció szerint rendeli hozzá az argumentumokat a paraméterekhez,
kivéve ha **nevesített argumentumokat (`named arguments`) használsz.

### Példa:

```kotlin
fun pelda(a: Boolean, b: Int) { ... }

pelda(true, 5)        // ✔️ helyes
pelda(5, true)        // ❌ hibás: fordító nem tudja automatikusan konvertálni az Int-et Boolean-ná
```
## 💡 Kotlin trükk: **Nevesített paraméterek**

Ha több `Boolean`, `Int`, `String` van egy függvényben, használhatsz **nevesített paramétereket**,
így olvashatóbb is lesz, és a sorrend sem lesz probléma:

### Példa:

```kotlin
fun auraColor(szentelt: Boolean, eleteroPont: Int, halhatatlan: Boolean): String { ... }

val aura = auraColor(
    szentelt = true,
    eleteroPont = 89,
    halhatatlan = false
)
```

🟢 Így teljesen egyértelmű, melyik érték melyik paraméterhez tartozik – **és nem kell betartani a sorrendet sem!**

elmezett érték** | Ha nem adsz meg értéket, a megadott defaultot használja |
 */