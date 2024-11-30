package org.example.lesson_15

abstract class Member {

    abstract fun sendMessage()
    abstract fun readForum()
}

class User : Member() {
    override fun sendMessage() {
        println("Пользователь отправил сообщение.")
    }

    override fun readForum() {
        println("Пользователю доступно чтение форума.")
    }
}

class Administrator : Member() {
    override fun readForum() {
        println("Администратору доступно чтение форума.")
    }

    override fun sendMessage() {
        println("Администратор отправил сообщение.")
    }

    fun deleteUser() {
        println("Администратор удалил юзера.")
    }

    fun deleteMessage() {
        println("Администратор удалил сообщение.")
    }
}

fun main() {
    val user = User()
    user.readForum()
    user.sendMessage()
    println()

    val admin = Administrator()
    admin.readForum()
    admin.sendMessage()
    admin.deleteMessage()
    admin.deleteUser()
}
