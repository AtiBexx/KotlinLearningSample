fun main() {
    var value: Any = "cool"
    var value2: Any = 15

    when {
        value is String && value2 is Int -> println("Ez egy szöveg és egy Int típus")
        value is String && value2 is Double -> println("Ez egy szöveg és egy Double típus")
        value is String -> println("Ez egy szöveg.")
        value is Int -> println("Ez egy egész szám.")
        value is Double -> println("Ez egy lebegőpontos szám.")
        else -> println("Ismeretlen típus.")
    }

    //println(value)  // pl.: "cool"

    // Ha szeretnéd megváltoztatni:
    value = "Ati"
    value2 = "15"
    //println(value)
}
