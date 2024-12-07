package org.example.lesson_16

class Player(
    val name: String,
    private var health: Int,
    private var attackForce: Int,
) {
    fun getHealth(): Int {
        return health
    }

    fun getAttackForce(): Int {
        return attackForce
    }

    private fun die() {
        println("Игрок $name умер.")
        health = 0
        attackForce = 0
    }

    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            println("Игрок $name получил $damage урона. Осталось здоровья: $health.")
            if (health <= 0) {
                die()
            }
        } else {
            println("Игрок $name мертв и не может получать урон.")
        }
    }

    fun getHeal(healAmount: Int) {
        if (health > 0) {
            health += healAmount
            println("Игрок $name получил $healAmount здоровья. Текущее здоровье: $health.")
        } else {
            println("Игрок $name мертв и не может получать очки здоровья.")
        }
    }
}

fun main() {
    val player = Player("Player1", 10, 1)

    player.takeDamage(10)
    player.getHeal(1)
}