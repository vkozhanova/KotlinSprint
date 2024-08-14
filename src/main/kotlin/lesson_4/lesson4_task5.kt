package org.example.lesson_4

fun main() {
    println("Сообщите о наличии повреждений корпуса (true/false):")
    val hasDamage = readLine()?.toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crew = readLine()?.toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val provision = readLine()?.toIntOrNull() ?: 0

    println("Сообщите о благоприятности метеоусловий (true/false):")
    val isWeatherAlright = readLine()?.toBoolean() ?: false

    val canGo = (!hasDamage && crew in 55..70 && provision > 50 && isWeatherAlright) ||
            (hasDamage && crew == 70 && isWeatherAlright && provision >= 50)

    if (canGo) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправться в плавание.")
    }
}