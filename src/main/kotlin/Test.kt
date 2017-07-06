
open class Animal(var name: String) {

    fun speak(sound: String) = println(sound)

    fun run() = println("$name running")
}

class Cat(name: String) : Animal(name)

class Dog(name: String) : Animal(name) {

    fun eat() = println("$name eating")
}

fun main(args: Array<String>) {

    val peak = Cat("Peak")
    peak.speak("Kim...")
    peak.run()

    val dang = Dog("Dang")
    dang.speak("Mint")
    dang.run()
    dang.eat()
}





