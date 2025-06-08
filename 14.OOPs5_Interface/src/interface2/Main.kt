package interface2

fun main() {

    val circle = Circle()
    val  coloredCircle =ColoredCircle()
    val isFilled=coloredCircle.isFilled()


    circle.draw()
    println()
    coloredCircle.draw()
    println()
    coloredCircle.fill()
    println()
    println("Is filled ? : $isFilled")
}