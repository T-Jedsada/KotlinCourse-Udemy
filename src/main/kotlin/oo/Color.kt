package oo

enum class Color(val value: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF66);

    fun containsRed() = this.value and 0xFF0000 != 0
}

fun main(args: Array<String>) {
    println(0x10) //16
    println(0x1F) //31
    println(0xFF) //255
    println(0xCAFEBABE) //3405691582

    println(0x000000) //black
    println(0xFFFFFF) //white
    println(0xFF0000) //red
    println(0x00FF00) //green
    println(0x0000FF) //blue
    println(0x000088) //dark blue

    //bitwise operator
    println(0b1101 or 0b1000) //13
    println(0b1101 xor 0b1000) //5

    println(40.inc())
    println(40.inv())
}