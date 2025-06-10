package list

import kotlin.collections.List

class Mylist {
    fun list1(): List<Int> {
      return  listOf(1, 2, 3, 4, 5, 6)
    }
    fun fruits(): List<String> {
          return listOf("Apple", "Banana","Orange","Apple")
    }
    fun colors() :MutableList<String> {
        val myColors:MutableList<String> =  mutableListOf("Red", "Green", "Blue")
        return  (myColors)
    }

}

