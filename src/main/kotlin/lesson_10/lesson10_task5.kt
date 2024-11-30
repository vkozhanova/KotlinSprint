package org.example.lesson_10

import kotlin.random.Random

fun main() {

    println("Введите логин:")
    val inputLogin = readln()

    println("Введите пароль:")
    val inputPass = readln()

    val token = authorize(inputLogin, inputPass)
    if (token != null) {
        println("Авторизация успешна!")
        println("Ваша корзина: ${getBasket(token)}")
    } else {
        println("Неудачная авторизация!")
    }
}
const val LOGIN = "userLogin"
const val PASSWORD = "userPassword"

fun authorize(inputLogin: String, inputPass: String): String? {
    val numbers = ('0'..'9').toList()
    val lowerCaseChars = ('a'..'z').toList()
    val upperCaseChars = ('A'..'Z').toList()
    val allChars = numbers + lowerCaseChars + upperCaseChars

    if (inputLogin == LOGIN && inputPass == PASSWORD) {
        val token = StringBuilder()

        for (i in 0 until 32) {
            val randomChar = allChars[Random.nextInt(allChars.size)]
            token.append(randomChar)
        }
        return token.toString()
    }
    return null
}

fun getBasket(token: String): List<String> {
    val goods = listOf("картина", "корзина", "картонка")
    return goods
}


