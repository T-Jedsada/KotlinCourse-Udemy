package io

import java.io.File

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()
    val (maxIP, maxCount) = ipToCount.entries.maxBy { it.value }!!
    println("Most frequent IP address is $maxIP, which occurred $maxCount times.")
}

private fun readFile(fileName: String) = File("src/example.txt")
        .inputStream().bufferedReader().use { it.readLine() }