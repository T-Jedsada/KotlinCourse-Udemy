package oo

// DRY don't repeat yourself
open class Stack<E>(vararg items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun pop() = when (!isEmpty()) {
        true -> elements.removeAt(elements.size - 1)
        else -> "Empty"
    }

    private fun isEmpty() = elements.isEmpty()
}

fun <T> stackOf(vararg element: T): Stack<T> {
    return Stack(*element)
}

fun main(args: Array<String>) {
    val stack = Stack(4, 2, 3, 5, 1)

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    stack.push(19)
    println(stack.pop())

    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3) {
        println(stack2.pop())
    }
}