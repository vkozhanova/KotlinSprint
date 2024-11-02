package org.example.lesson_9

fun main() {

    val ingredientsList = mutableListOf<String>()
    var count = 0

    while (count < 5) {
        println("Введите ингредиент ${count + 1}:")
        val userIngredient = readlnOrNull()?.trim() ?: ""
        if (userIngredient.isNotEmpty()) {
            if (ingredientsList.contains(userIngredient)) {
                println("Этот ингредиент уже есть в списке.")
            } else {
                ingredientsList.add(userIngredient)
                count++
            }
        } else {
            println("Введите ингредиент заново:")
        }
    }

    ingredientsList.sort()

    val sortedList = ingredientsList.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar {
            it.uppercase()
        } else ingredient.lowercase()
    }

    val resultList = sortedList.joinToString(", ")
    println(resultList)
}
