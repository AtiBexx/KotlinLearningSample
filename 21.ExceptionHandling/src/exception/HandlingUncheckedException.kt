package exception

fun main(){

    try {
        val result = 10/0 //Hibát dob mert nem lehet nulla
        //a hiba kimenete Error : / by zero
        println("Result : $result")
    }catch (e: Exception){
        println("Error : ${e.message}")
    }
}