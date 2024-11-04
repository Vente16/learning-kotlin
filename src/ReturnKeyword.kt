import kotlin.random.Random

fun main() {
    greet("John")
    println("random -> ${randomId(10)}")
    println("sum -> ${sum(22, 30)}")
    val (string, num) = getTwoTypes()
    println("Two types (string: $string) -- (integer: $num) ")
    val (integer, string3, boleean) = getThreeTypes()
    println("Three types (integer: $integer, string: $string3, boleean: $boleean) ")
}

fun greet(name: String) {
   println("Hello $name!")
   // everything after return keyword won't be executed
   return
   println("More logic over here")
   println("This is not going to be printed!")
}

// Returns functions types
fun double(num: Int): Int {
  return num * 2
}

fun randomId(size: Int): String {
    var random = ""
    for (i in 0 until size) {
        random = "$random${Random.nextInt(0, 10).toString()}"
    }
    return random
}

// Single expression functions
fun sum(a: Int, b: Int): Int = a + b


// Returning multiple types

// Returning two types
fun getTwoTypes(): Pair<String, Int> {
    return  "John" to 20
}

// return with Pair
fun getTwoTypesPair(): Pair<String, Int> {
    return Pair("John", 20)
}

fun getTwoTypesPairOneLine(): Pair<String, Int> = Pair("John", 20)

// Single line expression for two types
fun getTwoTypesOnLine(): Pair<String, Int> = "John" to 20
/* implicit typing
fun getTwoTypesOnLine() = "John" to 20 */

// Returning three types
fun getThreeTypes(): Triple<Int, String, Boolean> {
    return  Triple(
        20,
        "Kendal",
        true)
}

// Single line expression for two types
fun getThreeTypesOnLine(): Triple<Int, String, Boolean> = Triple(20, "Kendal", true)
/* implicit typing
fun getTwoTypesOnLine() = Triple(20, "Kendal", true) */