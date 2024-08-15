package org.example.lesson_5


fun main() {
    val secretNums = mutableListOf<Int>()
    for (i in 0..2) {
        secretNums += (0..42).random()
    }

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