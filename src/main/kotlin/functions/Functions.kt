package functions

import java.util.*

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(49.9F, 48.99F))
    println(min(49.9F, 48.99F))
}

fun helloWorld() = println("hello world")

fun printWithSpaces(test: String) {
    test.forEach { print(it.plus(" ")) }
    println()
}

fun getCurrentDate(): Date = Date()

fun max(a: Float, b: Float) = maxOf(a, b)

fun min(a: Float, b: Float) = minOf(a, b)