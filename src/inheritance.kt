fun main() {
   val person = Person("Timmy", 20, "waiter")
   person.buy()
   val secretary = Employee("Britanny", 25, "secretary", 5000.00)
   secretary.buy(3000.00)
}

// adding 'open' keyword to class to let know that the class can be extended
open class Person(
    open var name: String,
    open var age: Int,
    open var occupation: String
) {

  fun speak() {
    println("$name is speaking...")
  }

  fun sleep(){
    println("$name is sleeping...")
  }

  open fun buy(price: Double = 0.00) {
    println("$name is buying...")
  }

  override fun toString(): String {
    return "Person(name='$name', age=$age, occupation='$occupation')"
  }
}

class Employee(
    name: String,
    age: Int,
    occupation: String,
    var salary: Double
  ): Person(name, age, occupation) {
  override fun buy(price: Double) {

    if(price > salary) {
      println("Sorry, $name can not buy that it's price is higher than the salary($salary).")
      return
    }

    val result = salary - price
    println("$name has bought something, now $name has $result")
  }
}