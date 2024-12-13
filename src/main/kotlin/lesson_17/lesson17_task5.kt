package org.example.lesson_17

class User(_login: String, _password: String) {

    var login: String = _login
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен на $value.")
        }

    var password: String = _password
        get() {
            return "*".repeat(field.length)
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
    println(user.password)
}