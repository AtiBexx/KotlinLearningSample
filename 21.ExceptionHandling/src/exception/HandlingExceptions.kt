package exception

import java.io.File
import java.io.FileReader
import java.io.IOException

fun main() {
    try {
        val file = File("src/exception/example.txt")
        // val file = File("src/example.txt") //hibat dodna a rendszer nem találja a megdot fájlt
       val reader = FileReader(file)
        println("File read sucessfully.")
        reader.close()
    }catch (e: IOException){
        println("Error reading the file: ${e.message}")//e.message automatikusan kiirja a hibát
    }
}