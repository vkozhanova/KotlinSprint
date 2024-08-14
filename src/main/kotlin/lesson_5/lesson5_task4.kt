package org.example.lesson_5

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println("Пожалуйста, введите ваше имя:")
    val inputName = readLine()!!

    if (inputName == "Zaphod") {
        println("Введите пароль:")
        val inputPassword = readLine()!!
        if (inputPassword == userPassword) {
            println("Добро пожаловать, $userName! Вы имеете доступ к управлению кораблем.")
        } else {
            println("Неверный пароль.")
        }
    } else {
        println("Пользователь не найден. Хотите зарегистрироваться? (да / нет)")
        val inputResp = readLine()!!
        if (inputResp == "да") {
            println("Регистрация завершена.")
        } else {
            println("Хорошо, до свидания!")
        }
    }
}