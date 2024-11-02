package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов одной строкой, разделяя их пробелом:")
    val userInput = readlnOrNull() ?: ""

    val ingredientsList = userInput.split(", ").toMutableList()

    val sortedList = ingredientsList.sorted()
    println(sortedList)
}