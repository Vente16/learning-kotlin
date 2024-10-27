fun main() {
   val letters = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')

   for (index in letters.indices) {
     println("index: $index -> ${letters[index]}")
   }

    println(" --- reverse ----")
    for (index in letters.indices.reversed()) {
        println("index: $index -> ${letters[index]}")
    }
}