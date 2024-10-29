package org.example.lesson_6

fun main() {
    println("Введите отсчетное время в секундах.")
    var userTime = readLine()?.toInt()?: 0

    while (userTime > 0) {
        println("Осталось  секунд: ${userTime--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}