package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun printProperties(user: User) {
    println("id = ${user.id}, login = ${user.login}, password = ${user.password}, email = ${user.email}")
}

fun main() {
    val user1 = User(1, "user_1", "Hr1fd", "user_1@gmail.com")

    val user2 = User(2, "user_2", "Li&fa", "user_2@gmail.com")

    printProperties(user1)
    printProperties(user2)
}