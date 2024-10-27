fun main() {
  val names = arrayOf<String>("John", "Peter", "Tiffany", "Kendal")
  val isJuanInNames = if("Juan" in names) "Found it" else "No found it"
  println(names.contentToString())
  println(names[0]) // John
  println(names[1]) // Peter -> before changing its value
  names[1] = "Anna"
  println(names[1]) // Anna
  println(names.size)
  println(isJuanInNames)

  val arrayOfNulls = arrayOfNulls<String>(5)
  println(arrayOfNulls.contentToString()) // [null, null, null, null, null]
  arrayOfNulls.fill(">.<")
  println(arrayOfNulls.contentToString()) // [>.<, >.<, >.<, >.<, >.<]
}