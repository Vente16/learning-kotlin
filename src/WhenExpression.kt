fun main() {
  val input = "F"
  when (input) {
      "F" -> println("Female")
      "M" -> println("Male")
      else -> println("Unknown gender")
  }
  // It can be like this as well
  val genderValue = when (input) {
      "F" -> "Female"
      "M" -> "Male"
      else -> "Unknown gender"
  }

  println("genderValue --> $genderValue")

  // When using expressions :D
  when {
      (10 > 10) -> println("good")
      (10 > 20) -> println("bad")
      (10 == 10) -> println("Both are equals")
      else -> println("Unknown operation")
  }


  // When using ranges
  val age = 20
  when (age) {
     in 0..2 -> println("A baby")
     in 2 .. 12 -> println("A kid")
     in 13 .. 22 -> println("A Teenager")
     in 23..30 -> println("A Young adult")
     else -> println("An adult")
  }
}