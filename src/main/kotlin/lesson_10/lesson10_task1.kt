package org.example.lesson_10

fun main() {
    val playerCast = castDice("Игрок")
    val compCast = castDice("Компьютер")

    Thread.sleep(1000)
    when {
        playerCast > compCast -> println("Победило человечество.")

        compCast > playerCast -> println("Победила машина")

        else -> println("Победила дружба.")
    }
}

fun castDice(player: String): Int {
    val castResult = (1..6).random()
    println("$player бросает кубик...")
    Thread.sleep(1000)
    println("Результат: $castResult")

    return castResult
}