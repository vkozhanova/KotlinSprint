package org.example.lesson_5

fun main() {
    println("Для доступа к приложению подтвердите, что вы человек. Введите ответ 3 + 3 =")

    val result = readLine()?.toIntOrNull() ?: 0

    if (result == 6) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
