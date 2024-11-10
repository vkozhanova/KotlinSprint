package org.example.lesson_10

fun main() {
   var playerWins = 0
    var anotherGame: String

    do {
        val playerCast = throwDice("Игрок")
        val compCast = throwDice("Компьютер")

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

fun throwDice(player: String): Int {
    val castResult = (1..6).random()
    println("$player бросает кубик...")
    Thread.sleep(1000)
    println("Результат: $castResult")

    return castResult
}
