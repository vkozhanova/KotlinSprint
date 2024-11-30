package org.example.lesson_9

fun main() {

    val ingredientsSet = mutableSetOf<String>()
    var count = 0

    while (count < 5) {
        println("Введите ингредиент ${count + 1}:")
        val userIngredient = readlnOrNull()?.trim() ?: ""
        if (userIngredient.isNotEmpty()) {
            if (ingredientsSet.contains(userIngredient)) {
                println("Этот ингредиент уже есть в списке.")
            } else {
                ingredientsSet.add(userIngredient)
                count++
            }
        } else {
            println("Введите ингредиент заново:")
        }
    }

    val formatedList = ingredientsSet.toList().sorted().mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar{ it.uppercase()
        } else ingredient.lowercase()
    }

    println(formatedList.joinToString(", "))
}
