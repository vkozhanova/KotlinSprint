package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {

    fun printProperties() {
        println("id = $id, login = $login, password = $password, email = $email, bio = ${bio ?: "Нет доступной информации"}.")
    }

    fun recordBio(bioInput: String) {
        bio = bioInput
        println("Информация успешно добавлена!")
    }

    fun changePassword(currentPass: String, newPass: String): Boolean {
        return if (currentPass == password) {
            password = newPass
            println("Пароль изменен!")
            true
        } else {
            println("Пароль неверен!")
            false
        }
    }
}

fun main() {
    val user = User2(1, "user_1", "Hr1fd", "user_1@gmail.com")

    user.printProperties()

    println("Напишите о себе:")
    val bioInput = readln()
    user.recordBio(bioInput)

    println("Введите текущий пароль:")
    val currentPassInput = readln()
    println("Введите новый пароль:")
    val newPassInput = readln()

    user.changePassword(currentPassInput, newPassInput)

    user.printProperties()
}

