package oo

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: String) : Driveable, Buildable {

    override val timeRequired: Int = 120

    override fun build() {
        println("Built a car...")
    }

    override fun drive() {
        println("Driven car...")
    }
}

class Motorcycle(val color: String) : Driveable {
    override fun drive() {
        println("Driven motorcycle...")
    }
}

fun main(args: Array<String>) {
    val car: Driveable = Car("Blue")
    car.drive()

    val motorcycle: Driveable = Motorcycle("Red")
    motorcycle.drive()
}