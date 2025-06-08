import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale

fun main() {
    // Lekérjük a mai nap nevét (pl. Monday)
    val day :String = LocalDate.now().dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH)
    // vagy ha magyarországon szeretnénk látni milyen nap van akko Locale.hu
    //LocalDate.now() adja a mai dátumot (pl. 2025-06-05)
    //.dayOfWeek az aktuális napot adja vissza DayOfWeek enumként (pl. THURSDAY)
    // .getDisplayName(TextStyle.FULL, Locale.ENGLISH)
    //ez a Java DayOfWeek enum osztály egyik metódusa,amely visszaadja szövegként, hogy milyen nap van ma
    //Például: "Monday", "Tuesday" stb.
//
    // Kotlinban when = Javában a switch-case
    when (day) {
        "Monday" -> println("It's the start of the week.")
        "Friday", "Saturday" -> println("Weekend is here.")
        else -> println("It's a regular day.")
    }
    println("Today is: $day") // csak infónak
}
