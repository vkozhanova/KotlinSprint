package org.example.lesson_5

fun main() {
    val num1 = 3
    val num2 = 3
    println("Для доступа к приложению подтвердите, что вы человек. Введите ответ $num1 + $num2 =")

    val result = readlnOrNull()?.toIntOrNull()

    if (result == (num1 + num2)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
