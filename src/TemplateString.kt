fun main() {
  val age = 20
  val name = "John"
  // Template string with values with $ symbol
  val message = "Hi $name, you are $age years old :)"
  println(message)
  // Template strings with expressions need ${}
  val expressionMessage = "Hi ${name.uppercase()}, you will be ${age + 5} years old in 5 years"
  println(expressionMessage)
}