package functionalOperations

fun main(){

    val myMap = FunctionalOperations()
    val functionalOperations :ResultData = myMap.mapOperations()
    val filteredNumbers : Filterresult = myMap.filterOperations()


    println("Original Numbers : ${functionalOperations.original}")
    println("Squared Numbers : ${functionalOperations.squared}")
    println()
    println("All numbers : ${functionalOperations.original.joinToString()}" +
            ", ${functionalOperations.squared.joinToString()}")
    println()
    println("Filtered Numbers : ${filteredNumbers.filtered} ")
    println()
    reduceOperations() //kiiratjuk a top-up függvényt
}
//Top-up függvény
//Ha nem egy osztályban van hanem egy kódban mondjuk a fun main alatt felett
//akkor csak abból a fájlból / osztályból hívható meg a class jobb módszer
//de ha gyorsan kell jó a top-up függvény is.
fun reduceOperations() {
    val numbers:List<Int> = listOf(1,2,3,4,5)
    val sum = numbers.reduce{acc:Int, number:Int -> acc + number}
    //reduce végig megy a listán balról jobbra
    //és összeadjuk vele a számokat
    println("Original numbers : $numbers")
    println("Sum : $sum")
}