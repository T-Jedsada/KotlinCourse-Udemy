package oo

open class Animal {
    internal var age = 0
        get() = field
        set(value) {
            if (value >= 0) field = value
        }

    internal val isDangerous = true

    protected var name = "John"

    //unmutable can't override set()
//    val name: String? = null
//        get() = field
//        set(value) = {
//
//        }
}

class Vertebrate : Animal() {

    fun introduceYourself() = println(name)
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 10
    animal.age = -111
    println(animal.age)
}