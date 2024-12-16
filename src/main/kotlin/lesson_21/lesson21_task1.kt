package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "AEIOUaeiou"
    return this.count { it in vowels }
}

fun main() {

    val string = "hello"
    println("Количество гласных в строке $string: ${string.vowelCount()}")
}