fun main() {
    loopForRange()
    println()
    forLoopWithCollection()
    println()
    forLoopWithCollection2()
    println()
    forLoopWithIndicates()
    println()
    forLoopWithSteps()
    println()
    forLoopWithRangesAndFilters()
    println()
    forLoopWithSteps2()
    println()
    matrixIncreasing()
    println()
    matrixIncreasing2()
    println()
    matrixDecrasing()
}
//for loop osztály
fun loopForRange(){
    for (i : Int in 1..5 ){ //i 1-5 ig kiírja a számokat
        println("Count: $i")
    }
}
//for loop 2 osztály
fun forLoopWithCollection(){
    val fruits : List<String>  = listOf("Apple, Banana, Orange")//lista
    //így egymás mellé írja listOf("Apple, Banana, Orange")
    //for loop
    for (item : String  in fruits){
        println("fruits: $item")
    }
}
//for loop 3 osztály
fun forLoopWithCollection2(){
    val fruits : List<String>  = listOf("Apple", "Banana", "Orange")//lista
    //így egymás allá írja írja istOf("Apple", "Banana", "Orange")
    //for loop
    for (item : String  in fruits){
        println("fruit: $item")
    }
}
fun forLoopWithIndicates(){
    val colors : List<String> = listOf("Red", "Green", "Blue")
    //
    //withIndex() visszaadja az elemek indexét és értékét is egyszerre
    for ((index,color )in colors.withIndex()){
        println("Color at index $index: $color ")
    }
}
fun forLoopWithSteps(){
    for (i in 10 downTo 1 step 2 ){
        //downto 1 lefelé megy 1-ig
        //step 2 minden második értéket irja ki(10,8,6 stb)
        println("Countdown : $i")
    }
}
fun forLoopWithSteps2(){
    for (i in 0..10 step 2  ){
        println("Countdown : $i")
    }
}
fun forLoopWithRangesAndFilters(){
    for (num in 0..20){
        if (num %2 == 0){
        //az aktuális szám osztható-e 2-vel
        //Ha osztható, akkor a maradék 0 -> == 0
            println("Event number : $num")
        }
    }
}
fun matrixIncreasing(){
    for (tetel in 1..4){//sorok száma
      for (darabSzam in 1.. tetel)  {
          print("Ati") //a kiiras
      }
        println()//uj sor
    }
}
fun matrixIncreasing2(){
    val szoveg :String = "Ati"
    for (tetel in 1..4){//sorok száma
        for (darabSzam in 1.. tetel)  {
            print(szoveg)
        }
        println()//uj sor
    }
}
fun matrixDecrasing(){
    for (i in 4 downTo 1){
        for (j in 1..i){
            print("Ati")
        }
        println()//uj sor
    }
}
