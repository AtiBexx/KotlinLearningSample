package Engine

open class Vehicle(val brand:String) {
    open fun start(){
        println("Starting the $brand vehicle ")
    }
}