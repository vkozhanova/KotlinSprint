package org.example.lesson_18

import kotlin.random.Random

open class Die(
    private val sides: Int,
) {
    open fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Кость с количеством граней $sides дала результат $result.")
    }
}

class DieType4 : Die(4)

class DieType6 : Die(6)

class DieType8 : Die(8)

fun main() {
    val diceList: List<Die> = listOf(DieType4(), DieType6(), DieType8())

    for (i in diceList) {
        i.roll()
    }
}