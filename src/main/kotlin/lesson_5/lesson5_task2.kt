package org.example.lesson_5
import java.time.LocalDate

fun main() {
    println("Введите свой год рождения:")

     val userYear = readLine()?.toIntOrNull() ?: 0
    val currentYear = LocalDate.now().year
    var resultAge = currentYear - userYear

    if ((resultAge <= AGE_OF_MAGORITY) || (userYear == 0)) {
        println("Показать главный экран")
    } else {
        println("Показать скрытый контент")
    }
}

const val AGE_OF_MAGORITY = 18