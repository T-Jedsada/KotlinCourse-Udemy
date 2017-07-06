package loop

import java.util.*

fun main(args: Array<String>) {
//    val sum: Int = (1..100).sum()
//    println(sum)
//
//    val list = listOf("JAVA", "Kotlin", "Swift")
//    for ((index, value) in list.withIndex()) {
//        println("Element at : $index is $value")
//    }
//
//    list.forEachIndexed { index, value -> println("Element at : $index is $value") }
//
//    var index = 9
//
//    while (index >= 0) {
//        println(index)
//        index--
//    }
//
//    for (c in "Jedsada") {
//        if (c == 's') break
//        print(c)
//    }
//
//    val listTest = listOf("Book", "Table", "Laptop")
//    for (str in listTest) {
//        if (!str.contains('o')) {
//            continue
//        }
//        println(str)
//    }
//
//    listTest.asSequence()
//            .filter { it.contains('o') }
//            .forEach { println(it) }
//
//    listTest.filter { it.contains('o') }
//            .forEach { println(it) }
//
//    outer@ for (i in 1..10) {
//        for (j in 1..10) {
//            if (i - j == 5) break@outer
//            println("$i - $j")
//        }
//    }
//
//    //challenge
//    val result = (100..100000).sum()
//    println(result)


    val a: Int = 5
    val b = 4

    var firstName: String = "20scoops"
    var lastName = "CNX"

    // Mutable
    firstName = "Jedsada"

    //Immutable
//    a = 6

    //safe null exception
    var cannotNull = "String"
//    cannotNull = null

    var nullable: String? = "String"
    nullable = null
    println(nullable?.trim())

    //Expect nullable must have value
    println(nullable!!.trim())


    val obj: Any = 6

    if (obj is String) {
        println(obj.toLowerCase())
    } else if (obj is Int) {
        println(obj.plus(4))
    } else if (obj is Float) {
        println("%.2f".format(obj))
    }

    when (obj) {
        is String -> {
            println(obj.toLowerCase())
        }
        is Int -> {
            println(obj.plus(4))
        }
        is Float, Double -> {
            println("%.2f".format(obj))
        }
    }

    val number: Int = 5
    val resultIf = if (number == 5) {
        number + 1
    } else {
        number + 2
    }

    val resultWhen = when (number) {
        5 -> number + 1
        else -> number + 2
    }


    class A {

    }

    class B constructor(fullname: String, age: Int) {

    }

    class C(fullname: String, age: Int) {

    }

}