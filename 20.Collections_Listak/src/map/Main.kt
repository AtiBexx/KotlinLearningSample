package map

fun main(){

    val myMap = Map1()
    val fruitPriceList: Map<String, Double> = myMap.fruitPrices()
    val myList:Map<String, List<String>> = myMap.mySettList
        println(fruitPriceList)
    val carModels:Map<String, String> = myMap.mapOperation()
    val student : MutableMap<String, Int> = myMap.mapModification()
    val country: Map<String, Int> =myMap.mapIteration()

    println()// uj sor
    //stringé alakitjuk jobban egymás alatt megjelenítjük
    val formattedList:List<String> = fruitPriceList.map { "${it.key}: ${it.value}" }
    println(formattedList.joinToString("\n"))
    //vagy
    val formattedList2: String =fruitPriceList.map { (k:String, v:Double) ->
        "$k: $v" }.joinToString("\n")
    println()//uj sor
    println(formattedList2)
    println()//uj sor
    //Stringé alakitjuk
    val formattedList3:String = myList.map { (_:String , value:List<String>) ->
        value.joinToString()
    }.joinToString("\n")
    println(formattedList3)
    println()//uj sor
    println("Car models:$carModels ")
    println()//uj sor
    val carmodelformatedList = carModels.map { (k ,v) ->
        "${k.replace("{","")} ${v.replace("}","")}"}
    //a replace függvény 2 karaktert vár azért kel a zárojel megvonása után egy üres "" string
    println(carmodelformatedList.joinToString("\n"))
    println()//uj sor
    println("Tanulók és jegyeik:")
    println(student.map { (k,v) ->"$k: $v" }.joinToString ("\n"))
    // a kután kex után a : hozzáadja a a listához és akkor a kimenet
    //nem Alice 95 hanem Alice : 95
    student["Bob"] = 106
    println("New Student add: $student")
    println()//uj sor
    println("Országok néppeségeinek száma:")
    println(country.map { (k,v) ->"$k $v" }.joinToString("\n"))

    }


