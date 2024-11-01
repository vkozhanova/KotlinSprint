package org.example.lesson_8

fun main() {
    val ingredients = arrayOf(
        "говядина",
        "лук",
        "сахар",
        "соль",
        "перец черный",
        "бальзамико",
        "масло сливочное",
        "масло растительное"
    )
    println("Какой ингредиент вы хотите найти?")
    val inputIngredient = readln()

    if (ingredients.contains(inputIngredient)) {
        println("Ингредиент $inputIngredient в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}