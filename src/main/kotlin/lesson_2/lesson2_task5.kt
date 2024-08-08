package org.example.lesson_2

import kotlin.math.floor
import kotlin.math.pow


fun main() {
    val clientSum = 70000
    val rate = 16.7
    val timeInterval = 20

    val futureClientSum = floor(clientSum*(1 + (rate / 100)).pow(timeInterval.toDouble()) * 1000.0) / 1000.0

    println("Размер вклада составит $futureClientSum")
}
