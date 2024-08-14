package org.example.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val condition = isSunny && isTentOpen && (humidity == 20) && (currentSeason != "зима")
    println("Благоприятные ли сейчас условия для роста бобовых? $condition")
}