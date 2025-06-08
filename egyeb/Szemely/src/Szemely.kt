class Szemely {
    val nev:String,
    val kor:Int? = null
}
fun main() {
    val szemely = listOf(
        Szemely("Ati", kor = 36),
        Szemely("Anonymus"),
        )
    val idosebb = szemely.maxBy { it.kor ?: 0 }
    println("Idosebb szemely:$idosebb ")

}