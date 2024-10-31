package org.example.lesson_6

fun main() {
    println("Введите отсчетное время в секундах.")
    val inputTime = readLine()?.toLongOrNull() ?: 0

    Thread.sleep(inputTime * 1000)

    println("Прошло $inputTime сек.")
}