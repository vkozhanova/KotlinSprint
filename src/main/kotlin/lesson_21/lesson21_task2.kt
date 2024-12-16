package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {

    val numbers = listOf(2, 13, 15, 43, 1096, 18)
    println("Сумма всех четных чисел из списка: ${numbers.evenNumbersSum()}")
}