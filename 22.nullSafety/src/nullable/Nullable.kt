package nullable

import nullable.nullable.NullableValues
import nullable.nullable.elvisValue
import nullable.nullable.safeCallValues

class Nullable {
    fun nullableTypes(): NullableValues {
        var nullableString : String?="Hello Kotlin"
        val originalValue = nullableString
        nullableString = null
        val updatedValue = nullableString
        return NullableValues(
                originalValue, updatedValue )
    }
    fun safeCall(): safeCallValues {
        val text :String? = null
        val lenght : Int? = text?.length
        return safeCallValues(text,lenght )
    }
    fun elvisOperation(): elvisValue {
        val name : String? = null
        val elvisLenght :Int? = name?.length ?: -1 //-1 az érték nem null
        return elvisValue(name,elvisLenght)//visszaadjuk az értéket

    }
}