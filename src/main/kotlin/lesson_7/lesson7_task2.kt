package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var code = generatePass()
    while (true) {
        println("Ваш код авторизации: $code")
        println("Введите код авторизации:")
        val inputPass = readLine() ?: ""

        if (inputPass.toIntOrNull() == code) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверно. Попробуйте снова.")
            code = generatePass()
        }
    }
}

fun generatePass (): Int {
     return Random.nextInt(1000, 10000)
}