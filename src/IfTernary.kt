fun main() {
  val num1 = 20
  val num2 = 30
  // Simple ternary if, else statement
  val result = if (num1 > num2) ":)" else ":'("
  println(result)
  // ternary for else if cases
  val result2 =
      if (num1 == num2) ":)"
      else if (num1 == num2) "they're equals :D"
      // and so on, if you need more else if statements
      else ":("

  println(result2)
}