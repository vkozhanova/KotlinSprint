package org.example.lesson_4

fun main() {
    println("Сообщите о наличии повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toIntOrNull() ?: 0

    println("Введите количество ящиков с провизией:")
    val provision = readln().toIntOrNull() ?: 0

    println("Сообщите о благоприятности метеоусловий (true/false):")
    val isWeatherAlright = readln().toBoolean()

    if ((hasDamage == REC_HAS_DAMAGE && crew in REC_CREW_MIN..REC_CREW_MAX && provision > REC_PROVISION && isWeatherAlright == REC_WEATHER) ||
        (hasDamage == REC_HAS_DAMAGE && crew in REC_CREW_MIN..REC_CREW_MAX && provision > REC_PROVISION) ||
        (hasDamage != REC_HAS_DAMAGE && crew == REC_CREW_MAX && isWeatherAlright == REC_WEATHER && provision >= REC_PROVISION)) {

        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}

const val REC_CREW_MIN = 55
const val REC_CREW_MAX = 70
const val REC_PROVISION = 50
const val REC_WEATHER = true
const val REC_HAS_DAMAGE = false

