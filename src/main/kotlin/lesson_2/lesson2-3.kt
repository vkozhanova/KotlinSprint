package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinutes = 39
    val departureTime = (departureHour * TIME) + departureMinutes
    val travelTime = 457
    val arrivalTime = departureTime + travelTime
    val arrivalHour = arrivalTime / TIME
    val arrivalMinutes = arrivalTime - (arrivalHour * TIME)

    println("Время прибытия поезда: $arrivalHour:$arrivalMinutes")
}

const val TIME = 60