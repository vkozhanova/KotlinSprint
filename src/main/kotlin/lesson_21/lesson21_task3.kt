package org.example.lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {

    return this.currentHealth == this.maxHealth
}

fun main() {

    val player1 = Player("Magician", 3, 5)
    val player2 = Player("Cleric", 5, 5)

    println("Player ${player1.name} is healthy: ${player1.isHealthy()}")
    println("Player ${player2.name} is healthy: ${player2.isHealthy()}")
}