package oo

class Person(var name: String, var age: Int) {

    init {
        // first called when create Object
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String = "Kotlin") {
        println("Hello, $name!")
    }

    fun getYearOfBirth() = 2017 - age
}

fun main(args: Array<String>) {
    val person = Person("Kotlin", 23)
    println(person.name)
    person.name = "Jedsada"
    println(person.name)
    println(person.age)

    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())
}