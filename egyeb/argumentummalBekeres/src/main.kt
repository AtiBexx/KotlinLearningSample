import java.util.Scanner

fun main(args: Array<String>) {
    val nev = if (args.isNotEmpty()) {//ellenőrizik nem e üres
        args[0] // ha van parancssori argumentum, ez lesz a név
    } else {
        val scanner = Scanner(System.`in`)
        print("Mi a neved? ")
        scanner.nextLine() // ha nincs argumentum, kérdezzük meg
    }

    println("Helló, $nev!")
}
