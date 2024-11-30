package org.example.lesson_10

fun main() {
    println("Задайте количество символов для пароля.")
    val lengthPass = readln().toInt()

    println(generatePassword(lengthPass))
}

fun generatePassword(length: Int): String {
    val numbers = '0'..'9'
    val specialChars = "!#$%&'()*+,-./ "

    val passBuilder = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            passBuilder.append(numbers.random())
        } else {
            passBuilder.append(specialChars.random())
        }
    }

    return passBuilder.toString()
}

