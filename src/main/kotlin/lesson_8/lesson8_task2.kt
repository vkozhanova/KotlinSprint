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
    val userInput = readln()

    var ingFound = false

    for (i in ingredients) {
        if (userInput == i) {
            println("Ингредиент $userInput в рецепте есть.")
            ingFound = true
            break
        }
    }
    if (!ingFound) {
        println("Такого ингредиента в рецепте нет.")
    }
}
