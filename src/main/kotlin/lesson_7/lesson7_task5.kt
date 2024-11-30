package org.example.lesson_7

import kotlin.random.Random

fun main() {
    println("Задайте количество символов для пароля. Минимальная длина пароля - 6 символов.")
    val passLength = readln().toInt()

    if (passLength < 6) {
        println("Минимальная длина пароля - 6 символов.")
        return
    }
    println(generatePass(passLength))
}

fun generatePass(length: Int): String {
    val numbers = ('0'..'9').toList()
    val lowerCaseChars = ('a'..'z').toList()
    val upperCaseChars = ('A'..'Z').toList()

    val passBuilder = mutableListOf<Char>()

    passBuilder.add(numbers[Random.nextInt(numbers.size)])
    passBuilder.add(lowerCaseChars[Random.nextInt(lowerCaseChars.size)])
    passBuilder.add(upperCaseChars[Random.nextInt(upperCaseChars.size)])

    val allChars = numbers + lowerCaseChars + upperCaseChars

    for (i in 3 until length) {
        val randomChar = allChars[Random.nextInt(allChars.size)]
        passBuilder.add(randomChar)
    }

    passBuilder.shuffle()
    return passBuilder.joinToString("")
}
