fun main() {
  // ++ and --
  var number = 10
  /* using ++ after the variable is going to return the current value
   * and then increment the number
  */
  println(number++) // 10
  println(number) // 11 because here the number has been incremented
  /*
  * using ++ before the variable is going to return the value incremented
  *  */
  println(++number) // 12
  /*
  * Same logic is used for -- decrement values
  * */
  println(number--) // 12
  println(number) // 11
  println(--number) // 10
}