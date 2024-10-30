package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val password = generatePass()
    println(password)
}

fun generatePass(): String {
    val numbers = (0..9).toList()
    val chars = ('a'..'z').toList()
     val passBuilder = StringBuilder()

    for (i in 0 until 6) {
        if (i % 2 == 0) {
            val randomChar = chars[Random.nextInt(chars.size)]
            passBuilder.append(randomChar)
        } else {
            val randomNumbers = numbers[Random.nextInt(numbers.size)]
            passBuilder.append(randomNumbers)
        }
    }
return passBuilder.toString()
}