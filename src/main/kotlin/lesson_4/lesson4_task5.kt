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

    val canGo = (!hasDamage && crew in REC_CREW && provision > REC_PROVISION && isWeatherAlright) ||
            (!hasDamage && crew in REC_CREW && provision > REC_PROVISION) ||
            (hasDamage && crew == REC_CREW.last && isWeatherAlright && provision >= REC_PROVISION)

    if (canGo) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}

val REC_CREW = 55..70
const val REC_PROVISION = 50
