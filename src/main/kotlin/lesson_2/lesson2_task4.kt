package org.example.lesson_2

fun main() {
    val cristal = 7f
    val iron = 11f
    val buffCount = 20f

    val cristalBuff: Float = (buffCount / 100 * cristal)
    val ironBuff: Float = (buffCount / 100 * iron)
    println("Бафф на кристаллическую руду: ${cristalBuff.toInt()}")
    println("Бафф на железную руду: ${ironBuff.toInt()}")
}

