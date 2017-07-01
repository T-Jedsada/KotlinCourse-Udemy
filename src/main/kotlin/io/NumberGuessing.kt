package io

import java.util.*

fun main(args: Array<String>) {
    val number = Random().nextInt(1000) + 1
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess a number between 1 and 1000: ")
        input = readLine()

        try {
            guess = input?.toInt() as Int
            println(checkResult(guess, number))
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

fun checkResult(guess: Int, number: Int) = when {
    guess < number -> "To low"
    guess > number -> "To large"
    else -> "You won!"
}
