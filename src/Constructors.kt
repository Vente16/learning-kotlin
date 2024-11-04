fun main() {
    val phone =  SmartDeviceC("Samsung", "Phone xr34n", 400.00)
    println("brand = ${phone.brand}, price = ${phone.price}, model = ${phone.model}")
    phone.turnOn()
    phone.turnOff()
    println(phone.toString())
}

// blueprint
class SmartDeviceC(
    var brand: String,
    var model: String,
    var price: Double) {

    /* Multiple constructors */
    constructor() : this("", "", 0.0)
    constructor(brand: String, model: String) : this(brand, model, 0.0)

    // properties. variables
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
        return "SmartDeviceC(brand='$brand', model='$model', price=$price, isOn=$isOn)"
    }
}