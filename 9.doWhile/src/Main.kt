fun main() {
    basicloop()
    println()
    whileLoop()
    println()
    forBasicLoop()
    println()
}

fun basicloop(){
    var count=0

    do {
        println("Count : $count")
        count++
    }while (count<5)
}
fun whileLoop(){
    var count = 0
    while (count < 5) {
        println("Count : $count")
        count++
    }
}
fun forBasicLoop(){
    for (count in 0 until 5) {
        println("Count : $count")
    }
}