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
    println(ingredients.joinToString())

    println("Какой ингредиент вы хотите заменить?")
    val inputIngredient = readln()

    val index = ingredients.indexOf(inputIngredient)

    if (index == -1) {
        println("Такого ингредиента в списке нет.")
    } else {
        println("Какой ингредиент вы хотели бы добавить?")
        val replaceIngredient = readln()
        ingredients[index] = replaceIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")
    }
}