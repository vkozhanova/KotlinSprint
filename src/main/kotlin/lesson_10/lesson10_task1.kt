package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val playerCast = cast("Игрок")
    val compCast = cast("Компьютер")

    Thread.sleep(1000)
    when {
        playerCast > compCast -> println("Победило человечество.")

        compCast > playerCast -> println("Победила машина")

        else -> println("Победила дружба.")
    }
}

fun cast(player: String): Int {
    val castResult = Random.nextInt(1, 7)
    println("$player бросает кубик...")
    Thread.sleep(1000)
    println("Результат: $castResult")

    return castResult
}