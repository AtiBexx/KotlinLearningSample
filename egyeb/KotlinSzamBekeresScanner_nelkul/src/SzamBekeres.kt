fun main() {
    print("Adj meg egy számot: ")
    val input = readLine()
    val szam = input?.toIntOrNull()
    if (szam != null) {
        println("A megadott szám: $szam")
        println("A megadott szám kétszerese: ${szam * 2}")
    } else {
        println("Nem érvényes számot adtál meg.")
    }
}
