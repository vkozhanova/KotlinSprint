package org.example.lesson_10

import kotlin.random.Random

fun main() {
    println("Задайте количество символов для пароля.")
    val lengthPass = readln().toInt()

    println(generate(lengthPass))
}

fun generate(length: Int): String {
    val numbers = ('0'..'9').toList()
    val specialChars = "!#$%&'()*+,-./ ".toList()

    val passBuilder = mutableListOf<Char>()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            passBuilder.add(numbers[Random.nextInt(numbers.size)])
        } else {
            passBuilder.add(specialChars[Random.nextInt(specialChars.size)])
        }
    }

    return passBuilder.joinToString("")
}

