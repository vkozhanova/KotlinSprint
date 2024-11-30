package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,

    ) {
    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user = User("userName", "1Hr19")

    println("Введите пароль:")
    val inputPassword = readln()

    val isValid = user.validatePassword(inputPassword)

    if (isValid) {
        println("Пароль введен верно. Добро пожаловать!")
    } else {
        println("Пароль неверный.")
    }
}