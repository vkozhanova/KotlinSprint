package org.example.lesson_19

enum class Gender(val index: String) {
    MALE("м"),
    FEMALE("ж");
}

class User(
    val name: String,
    val gender: Gender,
)

fun main() {
    val users = mutableListOf<User>()

    println("Добро пожаловать в приложение 'Картотека'!")
    println("Введите данные в формате: 'Имя пол' (например: 'Иван м' или 'Мария ж').")
    println("Введите данные для пяти человек:")

    while (users.size < 5) {
        println("Введите данные:")

        val input = readln().trim()
        if (input.isEmpty()) {
            println("Ошибка. Ввод не может быть пустым. Пожалуйста, попробуйте снова.")
            continue
        }

        val parts = input.split(" ")
        if (parts.size != 2) {
            println("Ошибка! Пожалуйста, введите имя и пол в правильном формате.")
            continue
        }

        val name = parts[0]
        val genderInput = parts[1]

        val gender = when (genderInput) {
            "м" -> Gender.MALE
            "ж" -> Gender.FEMALE
            else -> {
                println("Ошибка! Неверное значение. Пожалуйста, используйте 'м' или 'ж'.")
                continue
            }
        }

        users.add(User(name, gender))
    }

    println("Список людей в картотеке:")
    for (user in users) {
        println("${user.name} - ${user.gender.index}.")
    }
}

