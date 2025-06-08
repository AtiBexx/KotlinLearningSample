package polymorphism

class MathOperations {

    fun add(a:Int,b:Int) :Int{
        return a+b //return eredmény visszaadása
    }
    fun add(a:Double,b:Double) :Double {
        return a + b
    }
    fun add(a:String,b:String): String {
        return a + b
    }
}