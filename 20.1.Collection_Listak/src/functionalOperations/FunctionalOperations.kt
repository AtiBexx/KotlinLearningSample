package functionalOperations
class FunctionalOperations {
    fun mapOperations(): ResultData { //ResulData osztály elvégzi az értékek visszaadását
        val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
        val squaredNumbers: List<Int> = numbers.map { it * it }//it*it négyzetre emel
        //visszaadjuk a ResulDatának
        //így 2 osztály lesz elérhető a Main-ben is.
        return ResultData (
            original = numbers,
            squared = squaredNumbers
        )
    }
    fun filterOperations() :Filterresult {
        val numbers: List<Int> = listOf(1,2,3,4,5)
        val eventNumbers :List<Int> = numbers.filter { it % 2 == 0 }

        return Filterresult(
            original = numbers,
            filtered = eventNumbers
        )
    }
}