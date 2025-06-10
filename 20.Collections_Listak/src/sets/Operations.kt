package sets

class Operations {
    fun mySetOperations(): List<String> {
        val set1: Set<Int> = setOf(1,2,3,4,5,6,7)
        val set2: Set<Int> = setOf(8,1,9,10)
        //most a közös tartalmukat ellenörizük
        val unionSet: Set<Int> = set1.union(set2)
        //
        val intersectionSet: Set<Int> = set1.intersect(set2)
        //
        val differentSet: Set<Int> = set1.subtract(set2)
        // vissza adjuk a listák értékét mapOf-al return mapOf-al
        return listOf  (
            "set1 : $set1",
            "set2 : $set2",
            "union : $unionSet",
            "intersection : $intersectionSet",
            "differentSet : $differentSet"
            )
    }
}