package org.example.lesson_11

class User(
    val login: String,
    val icon: String,
    var state: String,
)

class Room(
    val cover: String,
    val title: String,
    var participants: MutableList<User> = mutableListOf()
) {
    fun addUser(user: User) {
        participants.add(user)
        println("${user.login} присоединился к беседе $title.")
    }

    fun newState(login: String, newState: String) {
        val user = participants.find { it.login == login }
        if (user != null) {
            user.state = newState
            println("Статус ${user.login} обновлен на $newState.")
        } else {
            println("Участник $login не найден.")
        }
    }

    fun roomInfo() {
        println("Комната: $title")
        println("Обложка: $cover")
        println("Участники: ")
        for (user in participants) {
            println(" ${user.icon} ${user.login}: ${user.state}.")
        }
        println()
    }
}

fun main() {
    val room1 = Room(
        cover = "example.jpeg",
        title = "Чат для зайчат.",
    )

    room1.addUser(User(login = "user_1", icon = "example1.jpeg", state = "пользователь заглушен"))
    room1.addUser(User(login = "user_2", icon = "example2.jpeg", state = "разговаривает"))
    room1.addUser(User(login = "user_3", icon = "example3.jpeg", state = "микрофон выключен"))

    room1.roomInfo()
}