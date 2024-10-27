fun main() {
  var number = 1;
  val sports = listOf<String>("Soccer", "Tennis", "Swimming")
  var index = 0;
  while(number <= 5) {
    println("Number: $number")
    ++number
  }

  while(index < sports.size) {
    val sport = sports[index]
    println("Sport: $sport")
    ++index
  }
}