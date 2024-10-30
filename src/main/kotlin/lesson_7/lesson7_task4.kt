package org.example.lesson_7

fun main () {
    println("Введите количество секунд для отсчета:")
    val userInput = readLine()?.toIntOrNull() ?: 0

    for (i in userInput downTo 1) {
        println("Осталось $i секунд.")
        Thread.sleep(1000)
    }
    println("Время вышло")

}