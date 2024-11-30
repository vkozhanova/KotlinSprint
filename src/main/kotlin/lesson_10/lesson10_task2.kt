package org.example.lesson_10

fun main() {
    println("Придумайте логин:")
    val login = readLine() ?: ""

    println("Придумайте пароль:")
    val password = readLine() ?: ""

    if (isValid(login) && isValid(password)) {
        println("Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные. ")
    }
}

fun isValid (input: String) = input.length >= 4
