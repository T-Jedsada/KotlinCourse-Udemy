package loop

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(reverseList(numbers))
    println(reverseListMinimal(numbers))
    println(reverseListDownToMap(numbers))
    println(reverseListDownTo(numbers))
}

fun reverseList(list: List<Int>) = list.reversed()

fun reverseListMinimal(list: List<Int>): ArrayList<Int> {
    val result = arrayListOf<Int>()
    list.forEachIndexed { index, _ -> result.add(list[list.size - 1 - index]) }
    return result
}

fun reverseListDownToMap(list: List<Int>) = (list.size - 1 downTo 0).map { list[it] }

fun reverseListDownTo(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}