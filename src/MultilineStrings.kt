fun main() {
  val message = """
      Hi there! 
      how are you?
  """.trimIndent()
  println(message)

  val messageWithParams = """
      Hi %s!
      how are you?
  """.trimIndent()
  println(messageWithParams.format("John"))
}