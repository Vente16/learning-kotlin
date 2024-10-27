fun main() {
  val animals = listOf<String>("Dog", "Cat", "Elephant", "Camel")
  animals.forEach { println(it) }
  // by index and value
  animals.forEachIndexed { index, value -> println("$index -> $value") }
}