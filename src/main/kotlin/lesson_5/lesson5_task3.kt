package org.example.lesson_5

fun main() {
    val num1 = 3
    val num2 = 17

    println("Введите первое число от 0 до 42:")
    val userNum1 = readLine()?.toIntOrNull() ?: 0
    println("Введите второе число от 0 до 42:")
    val userNum2 = readLine()?.toIntOrNull() ?: 0

    if ((userNum1 == num1 && userNum1 == num2) || (userNum1 == num2 && userNum2 == num1)) {
        println("Вы выиграли главный приз!")
    } else if ((userNum1 == num1) || (userNum2 == num1) || (userNum1 == num2) || (userNum2 == num1)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Числа выигрыша: $num1, $num2.")
}