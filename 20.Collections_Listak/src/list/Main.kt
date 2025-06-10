package list

import sets.Operations

fun main(){
    val mylist = Mylist()
    val numbers =mylist.list1()
    val thirdElement = numbers[2] //23. elem megkeresése a listában

    val fruits:List<String> = mylist.fruits()
    val listSize = fruits.size
    val containsBanana = fruits.contains("Banana")
    val indexOfOrange = fruits.indexOf("Orange")

    val colors :MutableList<String> = mylist.colors()






    println("A lista eredményei: $numbers")
    println()//uj sor
    println("A lista eredményei:\n${numbers.joinToString ("\n") }") //uj sorba irja
    println()//uj sor
    println("A lista harmadik eleme: $thirdElement")
    println()//uj sor
    println("Gyümölcsök : $fruits")
    println("Gyümölcsök egymás alá írva")
    println("Gyümölcsök :\n${fruits.joinToString("\n")}")
    println()//uj sor
    println("Gyümölcsök Lista mérete:$listSize")//hány elem található benne
    println("A banán megtalálható benne: $containsBanana")
    println("A narancs hanyadik elem a listában: $indexOfOrange")
    println()
    println("Színek : ${colors.joinToString()}")//ha nem írsz a joinToStringbe semmit
    //eltünteti a [] zárójelet
    colors.remove("Blue")
    println("A kék szín eltávolítása : ${colors.joinToString()}")
    //colors.add("Blue")
    //colors.add("Orange")
    //vagy külön vagy listában adod hozzá a színeket
    colors.addAll(listOf("Blue", "Orange"))
    //eltünteti a [] zárójelet
    println("Színek hozzáadva : ${colors.joinToString()}")
    println("Ez volt mutableList !")
    println()//uj sor

}