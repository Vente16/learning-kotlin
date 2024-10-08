// local variables immutable should have const keyword
// local means that is accessible in any part of the file
const val PROGRAMMING_LANGUAGE = "Kotlin"

fun main() {
    // Variable immutable val, they can not be reassigned
    val name = "Jhon"
    println("Hello $name")
    // Variable mutable local var, they can be reassigned
    var age = 18
    age = 25
    println("You are $age years old")
    println("Hey! I'm learning $PROGRAMMING_LANGUAGE")
}