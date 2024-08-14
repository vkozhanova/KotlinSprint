package org.example.lesson_4

fun main() {
    val bookedToday = TABLES
    val bookedTomorrow = TABLES - 4

    val availableToday = bookedToday < TABLES
    val availableTomorrow = bookedTomorrow < TABLES

    println("[Доступность столиков на сегодня: $availableToday]")
    println("[Доступность столиков на завтра: $availableTomorrow]")
}

const val TABLES = 13