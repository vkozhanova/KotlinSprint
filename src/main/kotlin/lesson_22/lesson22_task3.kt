package org.example.lesson_22

data class User(
    val login: String,
    val password: String,
    val status: String,
)

fun main() {
    val user = User("userName", "QWERTY123", "online")

    val (login, password, status) = user
    println("логин: $login \nпароль: $password \nстатус: $status")
}