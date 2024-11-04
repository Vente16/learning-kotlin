fun main() {
  val names = listOf<String>("mary", "alice", "alex")
  val numbers = listOf<Int>(1, 2, 3, 4, 5)

  for (name in names) {
     println(name)
     // this contains a lambda expression
     val capitalizedName = name.replaceFirstChar {
         it.uppercase()
     }
     println(capitalizedName)
  }
  print(" ----- ")
  // We can use a single line if the block code only takes one line
  for (number in numbers) println(number)
}