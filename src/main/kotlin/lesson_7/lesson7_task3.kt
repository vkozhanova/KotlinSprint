package org.example.lesson_7

fun main() {
    println("Введите число:")
    val number = readln().toInt()

    val range = 0..number

    for (i in range step 2) {
        println(i)
    }
}