package oo

class House(val height: Double, val color: String, val price: Int = 10) {

    fun print() = println("House [height: $height, color: $color, price: $price]")
}

fun main(args: Array<String>) {
    val redHouse = House(height = 199.00, price = 99, color = "Red")
    redHouse.print()

    val blueHouse = House(height = 67.00, price = 99999, color = "Blue")
    blueHouse.print()

    val yellowHouse = House(height = 67.00, color = "Yellow")
    yellowHouse.print()
}