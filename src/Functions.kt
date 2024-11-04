fun main() {
   greet()
   greet2("John")
   enterToClub("Timmy", 17)
   // Named arguments
   enterToClub(name="Kendal", age=20)
   putANameToADog()
}

fun greet() {
   println("Helloo!")
}

// functions with arguments
fun greet2(name: String) {
  println("Hello $name!")
}

fun enterToClub(name: String, age: Int){
   println("Welcome $name to Beer Bar!")
   if (age >= 18) {
       println("You can enter")
   } else {
       println("Sorry, you need to be at least 18")
   }
}

// default arguments
fun putANameToADog(name: String = "Tom") {
   println("Okay, the dog is going to have $name name")
}