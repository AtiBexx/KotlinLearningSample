package sets

val uniqueNumber : Set <Int> = setOf(1,2,3,4,5,3,2,1)

fun setOperations(){
    val colors :Set <String> = setOf("Red","Green","Blue")
    val setSize:Set <String> =colors
    val containsRed : Boolean = colors.contains("Red")
    val isempty :Boolean = colors.isEmpty()
    val fruits :MutableSet <String> = mutableSetOf("Apple","Banan","Orange")
    println("Colors is empty? : $isempty")
    println()//uj sor
    println("Colors is set size? $setSize")
    println()
    println("Set of colors : $colors")
    println()//uj sor
    println("Contains Red ? : $containsRed")
    println()
    println("Fruits : $fruits")
    fruits.add("Grapes")
    println("Add Grapes to fruits : $fruits ")
    fruits.removeAll(listOf("Banana","Apple"))
    println("Remove some fruits : $fruits")
}

fun main(){

    println("OriginalSet : $uniqueNumber") //ki iratjuk a szamok listat
    println()//uj sor
    //ki iratjuk a setOperations-t
    val operations =Operations()
    val myList2: List<String> = operations.mySetOperations()
    val formated: String = myList2.joinToString("\n")
    println("Operations kt adatai : $formated")
}

