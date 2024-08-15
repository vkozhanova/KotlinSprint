package org.example.lesson_5
import java.util.Random

fun main() {
    val random = Random()
    val secretNums = mutableListOf(random.nextInt(43), random.nextInt(43), random.nextInt(43))
    val inputNums = mutableListOf<Int>()

    println("Введите три числа от 0 до 42:")

    for (i in 1..3) {
        val nums = readln().toIntOrNull() ?: 0
        inputNums.add(nums)
    }

    val matches = secretNums.intersect(inputNums).size

    when (matches) {
        3 -> println("Вы угадали все числа и выиграли джек-пот!")
        2 -> println("Вы угадали два числа и получите крупный приз!")
        1 -> println("Вы угадали одно число и получите утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа были: ${secretNums}")
}