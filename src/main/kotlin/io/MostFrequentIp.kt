package io

import java.io.File

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }

    val (maxIP, maxCount) = ipToCount.entries.maxBy { it.value }!!
    println("Most frequent IP address is $maxIP, which occurred $maxCount times.")
}