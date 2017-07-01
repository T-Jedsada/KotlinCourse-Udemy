package io

fun main(args: Array<String>) {
    print("Enter the world to guess: ")
    val word = readLine()

    when ((word !is String) and (word.isNullOrEmpty())) {
        true -> println("No word given, game ended."); else -> startGame(word?.toLowerCase()!!)
    }
}

@Suppress("UNREACHABLE_CODE")
fun startGame(word: String) {
    for (i in 1..1000) println()

    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    loop@ while (letters != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("\n#Wrong guesses: $fails\n")

        print("Guess latter: ")
        val input = readLine()
        when (input?.length!! > 1 || input.isNullOrEmpty()) {
            true -> {
                println("Please enter one latter!");++fails;continue@loop
            }
            else -> {
                when (word.toLowerCase().contains(input.toLowerCase())) {
                    true -> correctGuesses.add(input[0].toLowerCase());else -> ++fails
                };continue@loop
            }
        }
    }

    printExploredWord(word, correctGuesses)
    println("\n#Wrong guesses: $fails\n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) = word.forEach {
    if (correctGuesses.contains(it)) print(it + " "); else print("_ ")
}