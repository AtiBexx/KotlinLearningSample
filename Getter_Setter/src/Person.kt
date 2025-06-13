class Person {
    var name :String ="Ati"
        get() = field.replace("Ati","Awesome")
        // getter-ben a field a tényleges tárolt érték
        set(value) {
            // setter-ben a field-hez adjuk az új értéket
            field = value.trim()
        }
    var age : Int = 0
        set(value) {
            field = if (value > 0) value else 0
        }

}