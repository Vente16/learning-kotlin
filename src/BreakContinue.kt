fun main () {
  val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  for(number in numbers) {
    // skip the number
    if(number % 2 != 0) continue
    // exit from the loop
    if (number > 5) break
    println("$number ")
  }
  println("Everything has finished")
}