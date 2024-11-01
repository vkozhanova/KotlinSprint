package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов:")
    val count = readln().toInt()
    val arrayIngredients = Array(count) { "" }

    for (i in 0 until count) {
        println("Введите ингредиент ${i + 1}:")
        arrayIngredients[i] = readlnOrNull() ?: ""
    }
    println("Ингредиенты: ${arrayIngredients.joinToString(", ")}.")
}