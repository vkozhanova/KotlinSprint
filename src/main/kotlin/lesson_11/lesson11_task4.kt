package org.example.lesson_11

class CategoryDish (
    val Id: Int,
    val name: String,
    val icon: String,
    val description: String,
)

class Recipe (
    val Id: Int,
    val name: String,
    val icon: String,
    val isFavorite: Boolean = false,
    val ingredients: List<Ingredient>,
    val complexity: String,
    val vegan: Boolean,
    val gluten: Boolean,
    val cookingMethod: String,
    val time: String,
    val mainIngredient: String,
    val region: String,
    val calorific: String,
)

class Ingredient (
    val Id: Int,
    val name: String,
    val quantity: String,
    val measurementUnit: String,
)