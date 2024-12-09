package org.example.lesson_20

class Player(
    val name: String,
    var hasKey: Boolean,
)

val checkDoor: (Player) -> String = { player ->
    if (player.hasKey) {
        "Игрок ${player.name} открыл дверь"
    } else {
        "Дверь заперта."
    }
}

fun main() {
    val player1 = Player("Player1", true)
    val player2 = Player("Player2", false)

    println(checkDoor(player1))
    println(checkDoor(player2))
}