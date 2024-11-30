package org.example.lesson_9

fun main() {
    val ingredientsList = listOf(
        "говядина",
        "лук",
        "сахар",
        "соль",
        "перец черный",
        "бальзамико",
        "масло сливочное",
        "масло растительное"
    )
    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach { println(it) }
}