package org.example.lesson_9

fun main() {
    val ingredientsList = mutableListOf("говядина", "соль", "сахар")
    println("В рецепте есть базовые ингредиенты: $ingredientsList")
    println("Желаете добавить еще?")
    val userRespond = readln()
    if (userRespond.equals("НЕТ", ignoreCase = true)) {
        return
    } else {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()
        ingredientsList.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredientsList")
    }
}