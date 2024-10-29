package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var tries = 5
    val secretNum = Random.nextInt(1,10)
    println("Угадайте число от 1 до 9. У вас $tries попыток.")


    while (tries > 0){
        println("Введите число: ")
        val inputNum =  readln().toIntOrNull() ?: 0
        if (inputNum == secretNum) {
            println("Вы угадали! Это была великолепная игра!")
            return

        } else {
            tries--
            println("Неверно! Осталось $tries попыток.")
        }
    }
    println("Было загадано число: $secretNum")
}
