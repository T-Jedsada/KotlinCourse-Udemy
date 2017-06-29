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
}
