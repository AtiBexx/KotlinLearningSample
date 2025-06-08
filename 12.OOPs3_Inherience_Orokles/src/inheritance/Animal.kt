package inheritance

open class  Animal(val name :String) {

    open fun speak(){
        println("$name makes a sound")
    }
}