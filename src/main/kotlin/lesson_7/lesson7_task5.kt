package org.example.lesson_7

import kotlin.random.Random

fun main() {
    println("Задайте количество символов для пароля. Минимальная длина пароля - 6 символов.")
    val passLength = readLine()!!.toInt()

    if (passLength < 6) {
        println("Минимальная длина пароля - 6 символов.")
        return
    }
    println(generatePass(passLength))
}

fun generatePass(length: Int): String {

    val numbers = (0..9).toList()
    val lowerCaseChars = ('a'..'z').toList()
    val upperCaseChars = ('A'..'Z').toList()
    val passBuilder = StringBuilder()

    for (i in 0 until length) {
        val randomCharIndex = Random.nextInt(3)
        when (randomCharIndex) {
            0 -> {
                val randomNumber = numbers[Random.nextInt(numbers.size)]
                passBuilder.append(randomNumber)
            }
            1 -> {
                val randomLowerCaseChar = lowerCaseChars[Random.nextInt(lowerCaseChars.size)]
                passBuilder.append(randomLowerCaseChar)
            }
            2 -> {
                val randomUpperCaseChar = upperCaseChars[Random.nextInt(upperCaseChars.size)]
                passBuilder.append(randomUpperCaseChar)
            }
        }
    }
    return passBuilder.toString()
}
