fun main() {
   // It doesn't need the 'New' keyword as in other languages :O
   val phone =  SmartDevice()
   phone.brand = "Samsung"
   phone.price = 400.00
   phone.model = "Phone xr34n"
   println("brand = ${phone.brand}, price = ${phone.price}, model = ${phone.model}")
   phone.turnOn()
   phone.turnOff()
   println(phone.toString())
}

// blueprint
class SmartDevice  {
  // properties. variables
  var brand: String = ""
     // getter and setters, as the default they come this way, but we can change theirs behavior
     get() = field
     set(value) { field = value }

  var model: String = ""
     get() = field
     // each time that the model is assigned is going to convert it in uppercase
     set(value) { field = value.toUpperCase() }

  var price: Double = 0.0
  private var isOn: Boolean = false

  // behaviors. functions/methods
  fun turnOn() {
     isOn = true
     println("Turning on the $brand - $model \uD83D\uDD35")
  }

  fun turnOff() {
    isOn = false
    println("Turning off the $brand - $model \uD83D\uDD34")
  }

  override fun toString(): String {
     return "SmartDevice(brand='$brand', model='$model', price=$price)"
  }
}