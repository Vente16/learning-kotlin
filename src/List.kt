fun main() {
   // List are immutable
   val intList: List<Int> = listOf(1,2,3,4,5)
   val nameList: List<String> = listOf(
       "Sarah",
       "James",
       "Jessica",
       "Thelonious"
   )
   println(intList.joinToString())
   println(nameList[0])
   println(nameList.size)
   println(nameList.contains("John")) // false
   println(nameList.joinToString())
   // If we want to have a mutable list, we should use mutableListOf type
   val nameMutableList = mutableListOf("Sarah","James","Thelonious")
   nameMutableList.add("John")
   println(nameMutableList)
}