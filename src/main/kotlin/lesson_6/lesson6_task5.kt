package org.example.lesson_6

import kotlin.random.Random

fun main() {
    val usersInfo = mutableMapOf<String, String>()
    while (true) {
        println("Выберите действие: 1 - Вход, 2 - Регистрация")
        when (readLine()) {
            "1" -> login(usersInfo)
            "2" -> register(usersInfo)
            else -> println("Некорректно. Попробуйте снова.")
        }
    }
}

fun register(usersInfo: MutableMap<String, String>) {
    println("Придумайте логин:")
    val login = readLine() ?: ""

    println("Придумайте пароль:")
    val password = readLine() ?: ""

    if (usersInfo.containsKey(login)) {
        println("Этот логин занят. Пожалуйста, придумайте другой.")
    } else {
        usersInfo[login] = password
        println("Регистрация прошла успешно.")
    }
}

fun login (usersInfo: MutableMap<String, String>) {
    println("Введите логин:")
    val login = readLine() ?: ""

    println("Введите пароль:")
    val password = readLine() ?: ""

    if (usersInfo[login] == password) {
        if (verifyUser()) {
            println("Авторизация прошла успешно. Добро пожаловать!")
        } else {
            println("Доступ запрещен.")
        }
    } else {
        println("Ошибка авторизации. Попробуйте снова.")
    }
}

fun verifyUser(): Boolean {
    var attempts = 3
    while (attempts > 0) {
        val num1 = Random.nextInt(1, 10)
        val num2 = Random.nextInt(1, 10)
        val correctAns = num1 + num2

        println("Подтвердите, что вы не бот. Решите пример: $num1 + $num2 = ?")
        val userAns = readLine()?.toIntOrNull()
        if (userAns == correctAns) {
            return true
        } else {
            attempts--
            println("Неверно! Осталось попыток: $attempts.")
        }
    }
return false
}
