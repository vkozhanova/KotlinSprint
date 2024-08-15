package org.example.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val condition = (isSunny == COR_SUN_CONDITION) && (isTentOpen == COR_TENT_CONDITION) &&
            (humidity == COR_HUMIDITY) && (currentSeason != WRONG_SEASON)
    println("Благоприятные ли сейчас условия для роста бобовых? $condition")
}

const val COR_HUMIDITY = 20
const val COR_TENT_CONDITION = true
const val COR_SUN_CONDITION = true
const val WRONG_SEASON = "зима"