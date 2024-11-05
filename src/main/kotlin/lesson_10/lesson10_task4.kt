package org.example.lesson_10

import kotlin.random.Random

fun main() {
   var playerWins = 0
    var anotherGame: String

    do {
        val playerCast = cast("Игрок")
        val compCast = cast("Компьютер")

        Thread.sleep(1000)
        when {
            playerCast > compCast -> { println("Победило человечество.")
            playerWins++
        }

            compCast > playerCast -> println("Победила машина.")

            else -> println("Победила дружба.")
        }
        println("Хотите бростить кости еще раз? Введите \"да\" или \"нет\".")
        anotherGame = readln()
    }
    while (anotherGame.equals("да", ignoreCase = true))
    println("Вы выиграли $playerWins партий.")
}

fun cast(player: String): Int {
    val castResult = Random.nextInt(1, 7)
    println("$player бросает кубик...")
    Thread.sleep(1000)
    println("Результат: $castResult")

    return castResult
}
