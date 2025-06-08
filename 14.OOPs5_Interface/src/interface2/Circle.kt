package interface2

class Circle : Shape { //hogy felajalja az implements membert az interfacenek
    //nem szabad absztraknak lennie tehát
    //fun draw() nem kell legyen {} -ez a kapcsos zárojel
    override fun draw() {
        println("Drawing a circle")
    }
}


