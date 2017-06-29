package conditionals

import java.util.*

fun main(args: Array<String>) {
    val age = 35
    if (age < 18) println("You can't register.")
    else if (age < 21) println("Well, maybe you can register")
    else if (age < 27) println("Should be able register")
    else println("You're good to go!")

    println("The end.")

    val mode: Int = 4
    when (mode) {
        1 -> println("The mode is lazy.")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy.")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }

    val number = Random().nextInt(48) + 1
    when (number) {
        in 1..10 -> println("Number between 1 to 10 : $number")
        in 11..20 -> println("Number between 11 to 20 : $number")
        in 21..30 -> println("Number between 21 to 30 : $number")
        in 31..40 -> println("Number between 31 to 40 : $number")
        else -> println("Number more then 40 : $number")
    }
}
