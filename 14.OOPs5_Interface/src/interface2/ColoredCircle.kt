package interface2

class ColoredCircle : Shape,Fillable {
    override fun fill() {
        println("Filling the circle with color ")
    }
    override fun draw() {
        println("Drawing a colored Circle")
    }
}