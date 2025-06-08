package Engine

class Car (brand: String, val model:String): Vehicle(brand){
    override fun start() {
        super.start()
        println("Car is ready to go")
    }
}