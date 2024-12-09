package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun displayStatus() {
        println("$name, текущее здоровье: $currentHealth, максимальное здоровье: $maxHealth.")
    }
}

val healPotion: (Player) -> Unit = { player ->
    player.currentHealth = player.maxHealth
    println("${player.name} использовал лечебное зелье!")
}

fun main() {
    val player = Player("Маг", 6, 10)
    healPotion(player)
    player.displayStatus()
}