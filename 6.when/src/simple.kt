fun main() {

    var value :Any = 15
        //"Hello Word"

    when (value) {
        is String -> println("it is a string")
        is Int -> println( "It is an integer")
        else -> println("Unexcepted token")
    }
}