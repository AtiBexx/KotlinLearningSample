class Greeatings {
    fun printDetails(name :String, age:Int){//itt fogjuk megadni a mainben az adatokat
        fun displayMessage(greeating:String){
            println("$greeating , $name You are $age years old.")
        }
        displayMessage("Hello") //ezt fogja hozzaadni
    }
}