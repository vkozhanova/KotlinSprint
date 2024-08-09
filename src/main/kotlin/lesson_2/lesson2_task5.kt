package org.example.lesson_2

import kotlin.math.floor
import kotlin.math.pow
fun main() {
    val clientSum = 70000
    val rate = 16.7
    val timeInterval = 20

    val futureClientSum = clientSum * (1 + (rate / 100)).pow(timeInterval)
    println("Размер вклада составит %.3f".format(futureClientSum))
}
