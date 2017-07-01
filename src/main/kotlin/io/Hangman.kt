package io

fun main(args: Array<String>) {
    print("Enter the world to guess: ")
    val word = readLine()

    if ((word !is String) and (word.isNullOrEmpty())) {
        println("No word given, game ended.")
        return
    } else {
        startGame(word!!)
    }
}

fun startGame(word: String) {
    for (i in 1..1000) println()

    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("\n#Wrong guesses: $fails\n")

        print("Guess latter: ")
        val input = readLine()
        if (input.isNullOrEmpty()) {
            continue
        } else if (input?.length!! > 1) {
            println("Please enter one latter!")
            continue
        }

        if (word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            ++fails
        }
    }

    printExploredWord(word, correctGuesses)
    println("\n#Wrong guesses: $fails\n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)) {
            print(character + " ")
        } else {
            print("_ ")
        }
    }
}