package loop

fun main(args: Array<String>) {
    val sum: Int = (1..100).sum()
    println(sum)

    val list = listOf("JAVA", "Kotlin", "Swift")
    for ((index, value) in list.withIndex()) {
        println("Element at : $index is $value")
    }

    list.forEachIndexed { index, value -> println("Element at : $index is $value") }

    var index = 9

    while (index >= 0) {
        println(index)
        index--
    }

    for (c in "Jedsada") {
        if (c == 's') break
        print(c)
    }

    val listTest = listOf("Book", "Table", "Laptop")
    for (str in listTest) {
        if (!str.contains('o')) {
            continue
        }
        println(str)
    }

    listTest.asSequence()
            .filter { it.contains('o') }
            .forEach { println(it) }

    listTest.filter { it.contains('o') }
            .forEach { println(it) }

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) break@outer
            println("$i - $j")
        }
    }

    //challenge
    val result = (100..100000).sum()
    println(result)
}