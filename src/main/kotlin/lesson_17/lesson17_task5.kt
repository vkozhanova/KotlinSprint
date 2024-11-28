package org.example.lesson_17

class User(
    private var _login: String,
    private val _password: String,
) {
    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин успешно изменен на $value.")
        }

    var password: String
        get() {
            return "*".repeat(_password.length)
        }
        set(value) {
            println("Вы не можете изменить пароль.")
        }
}

fun main() {
    val user = User("user1", "12QW21")

    println("Ваш текущий логин: ${user.login}")
    user.login = "newUser"

    println("Ваш текущий пароль: ${user.password}")
    user.password = "23ER32"
}