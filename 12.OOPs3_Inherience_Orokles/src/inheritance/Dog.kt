package inheritance

class Dog (name :String) :Animal(name){

    fun wagTail(){
        println("$name wags tail")
    }
    override fun speak(){ //Felülírtuk a kutyánk nevét
        println("$name bark")
    }
}

