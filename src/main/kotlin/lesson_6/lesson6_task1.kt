package org.example.lesson_6

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
        println("Авторизация прошла успешно. Добро пожаловать!")
    } else {
        println("Ошибка авторизации. Попробуйте снова.")
    }
}