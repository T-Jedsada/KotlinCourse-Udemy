package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}

open class KotlinCourse : Course("Kotlin", 999.99), Learnable {
    override final fun learn() {
        super<Course>.learn()
        println("I'm one of the first people to learn Kotlin!")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

class SpacialKotlinCourse : KotlinCourse()

fun main(args: Array<String>) {
    val kotlinCourse = KotlinCourse()
    kotlinCourse.learn()

    val spacialKotlinCourse = SpacialKotlinCourse()
    spacialKotlinCourse.learn()
}