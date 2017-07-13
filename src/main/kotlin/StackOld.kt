class StackOld<T>(vararg element: T) {

    //String
    var list = mutableListOf<T>()

    fun push(element: T) = list.add(element)

    @Suppress("IMPLICIT_CAST_TO_ANY")
    fun pop() = when (list.isEmpty()) {
        true -> "Empty"
        else -> list.removeAt(list.size - 1)
    }
}

fun <T> stackOf(vararg t: T) = StackOld(*t)

fun main(args: Array<String>) {
    val stackInt = StackOld<Int>()
    println(stackInt.pop())

    stackOf<Int>()

    val stackString = StackOld<String>()
    println(stackString.pop())

    val stackDouble = StackOld<Double>()
    println(stackDouble.pop())
}