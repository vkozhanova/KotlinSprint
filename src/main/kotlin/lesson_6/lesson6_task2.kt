package org.example.lesson_6

fun main() {
    println("Введите отсчетное время в секундах.")
    val inputTime = readLine()?.toInt()?: 0
    var userTime = inputTime

    do {
        Thread.sleep(1000)
        userTime--

    } while (userTime > 0)
    println("Прошло $inputTime сек.")
}