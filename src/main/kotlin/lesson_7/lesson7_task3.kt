package org.example.lesson_7

fun main() {
    println("Введите число:")
    val number = readln().toInt()

    val range = 0..number

    for (i in range) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}