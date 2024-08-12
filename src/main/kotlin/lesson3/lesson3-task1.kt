package org.example.lesson
import java.util.Calendar

fun main() {
    val userName = "userName"
    val greeting: String

    val calendar = Calendar.getInstance()
    val currentHour = calendar.get(Calendar.HOUR_OF_DAY)

    if (currentHour >= 10 && currentHour <= 17) {
        greeting = "Добрый день, $userName!"
    } else {
        greeting = "Добрый вечер, $userName!"
    }
    println(greeting)
}