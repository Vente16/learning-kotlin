fun main() {
  // from 1 to 10
  for (i in 1..10) println(i)
  println(" ------ reversed -------")
  // from 10 to 1
  for (i in 10 downTo 1) println(i)
  // step
  println(" ------ steps -------")
  // it is going to step 2 by 2
  for (i in 0..10 step  2) println(i)
  println(" --- reversed step ----")
  for (i in 10 downTo 0 step  2) println(i)
}