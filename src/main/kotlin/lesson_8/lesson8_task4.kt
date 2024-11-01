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

    if (!ingredients.contains(inputIngredient)) {
        println("Такого ингредиента в списке нет.")
    } else {
        println("Какой ингредиент вы хотели бы добавить?")
        val replaceIngredient = readln()
        ingredients[ingredients.indexOf(inputIngredient)] = replaceIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")
    }




}