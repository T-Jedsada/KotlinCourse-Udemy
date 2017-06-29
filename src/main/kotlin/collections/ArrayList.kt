package collections

fun main(args: Array<String>) {
    val array = arrayOf("Texas", "Iowa", "California")

    val mixed = arrayOf("Kotlin", 1, 16f, 5L, 13.00, false)
    println(mixed[0])
    mixed[1] = 5
    println(mixed[1])

    val str = "Jedsada"
    println(str[str.length - 1])

    val state = arrayListOf("Nevada", "Florida")
    val allState = array + state
    allState.forEach { println("state : $it") }

    if (allState.contains("Kentucky")) {
        println("It contains Kentucky")
    } else {
        println("It doesn't contains Kentucky")
    }

    state.add(0, "Thailand")
    println(state)
    val removed = state.remove("Thailand")
    println(state)
    println(removed)

    val arrayList = arrayListOf("Dog", "Cat", "Rat")
    arrayList.add("Bat")
}