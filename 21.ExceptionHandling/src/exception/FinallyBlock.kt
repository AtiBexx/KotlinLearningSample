package exception

import java.io.File
import java.io.FileReader
import java.io.IOException

fun main() {
    var fileReader : FileReader? = null
    try {
        val file = File("src/exception/example.txt")
        fileReader = FileReader(file)
        println("File read is sucessfully.")
    }catch (e: IOException) {
        println("Error readin the file : ${e.message}")
    }finally {
        fileReader?.close()
        println("Cleanup operations in the finally block.")
    }
}