package oops

class Student(val name:String, val age:Int = 18) {
    init {
        println("Student Initialized = Name : $name, Age : $age")
    }

    fun displayInfo(){
        println("Student Information - Name : $name, Age : $age ")
    }
}