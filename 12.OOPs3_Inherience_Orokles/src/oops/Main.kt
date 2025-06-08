package oops
import inheritance.Budgie
import inheritance.Dog
fun main() {
    //Példányosítás
    val myDog = Dog("Buddy")
    myDog.speak()
    myDog.wagTail()
    println()
    val myBudgies = Budgie("Prüntyi")
    val myBudgies2 = Budgie("Pakito")
    myBudgies.speak()
    myBudgies2.speak()
    myBudgies.budgietail()
    myBudgies2.budgietail()
}