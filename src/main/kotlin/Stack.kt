class Stack<T> {

    var list = mutableListOf<T>()

    fun push(element: T) = list.add(element)

    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun pop() = when (!list.isEmpty()) {
        true -> list.removeAt(list.size - 1)
        else -> "Empty"
    }
}

fun main(args: Array<String>) {
    val intStack = Stack<Int>()
    intStack.push(5)
    intStack.push(6)
    println(intStack.pop())
    println(intStack.pop())
}
