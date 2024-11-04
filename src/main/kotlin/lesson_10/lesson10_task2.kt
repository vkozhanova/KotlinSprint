package org.example.lesson_10


fun main() {
    println("Придумайте логин:")
    val login = readLine() ?: ""

    println("Придумайте пароль:")
    val password = readLine() ?: ""

    if (validation(login) && validation(password)) {
        println("Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные. ")
    }
}

fun validation(input: String): Boolean {
   return input.length >= 4
}