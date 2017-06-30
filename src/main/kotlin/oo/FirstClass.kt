package oo

abstract class Normal {
    fun a() {}

    abstract fun b()
}

class SubClass : Normal() {
    override fun b() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

abstract class Human(open var name: String, open var age: Int) {
    abstract fun speak()

    fun greet(name: String = this.name) {
        println("Hello, $name!")
    }

    fun getYearOfBirth() = 2017 - age

    open fun overrideHere(name: String) {
        println("Hello, $name")
    }
}

class Employee(override var name: String, override var age: Int) : Human(name, age) {
    override fun speak() = println("Hi there, I'm a employee")

    fun receivePayment() = println("Receive payment.")

    override fun overrideHere(name: String) {
        println("Hi, $name")
    }
}

class Student(override var name: String, override var age: Int, val studentID: Long) : Human(name, age) {
    override fun speak() = println("Hi there, I'm a student")

    fun isIntelligent() = true
    fun speakStudentID() = println("StudentID: $studentID")
}

fun main(args: Array<String>) {
//    val human = Human("Kotlin", 23)
//    println(human.name)
//    human.name = "Jedsada"
//    println(human.name)
//    println(human.age)
//
//    human.speak()
//    human.greet("world")
//    println(human.getYearOfBirth())

    val employee = Employee("Employee", 60)
    employee.speak()
    employee.greet()
    employee.receivePayment()
    employee.overrideHere("POND")

    val student = Student("Scoops", 2, 55021744)
    student.speak()
    println(student.getYearOfBirth())
    student.speakStudentID()
    println(student.isIntelligent())
}