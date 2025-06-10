package map

class Map1 {
   fun fruitPrices(): Map<String, Double> = mapOf(
      "Apple " to 1.0,
      "Banana" to 0.75,
      "Orange" to 1.25
   )

   val mySettList: Map<String, List<String>> = mapOf(
      "set1" to listOf("1", "2", "3"),
      "set2" to listOf("4", "5", "6")
   )

   fun mapOperation(): Map<String, String>{
   val carModel: Map<Int, String> = mapOf(
      2022 to "Model Y", 2021 to "Model 3",
      2020 to "Model S"
   )
   val carSize: Int = carModel.size
   val contains2021:Boolean = carModel.containsKey(2021)
   val containsModel = carModel.containsValue("Model S")

   return mapOf(
   "Carmodel" to carModel.toString(),
   "Carsize" to carSize.toString(),
   "Contains 2021" to contains2021.toString(),
   "ContainsModell" to containsModel.toString()
   )
}
   fun mapModification(): MutableMap<String, Int> {
      val studentGrades:MutableMap<String,Int>
      = mutableMapOf("Alice" to 95,"Bob" to 87,"Charlie" to 92)
      //println("OriginaList: $studentGrades")
      studentGrades["David"] = 88
      //println("Add-ed list: $studentGrades")
      studentGrades.remove("Bob")
      //println("Remove List: $studentGrades")
      return studentGrades
   }
   fun mapIteration(): Map<String, Int> {
      val countryPopulation:Map<String,Int> =
         mapOf("Usa" to 331,"China" to 1441,"India" to 1393)
      for ((country,population) in countryPopulation){
         println("Population to $country : $population million")
      }
      return countryPopulation
   }

}
