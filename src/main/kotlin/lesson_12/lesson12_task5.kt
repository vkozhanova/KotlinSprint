package org.example.lesson_12

import kotlin.random.Random

class WeatherRep (kelvinsDay: Int, kelvinsNight: Int, var isPrecipitation: Boolean = false) {

    var dayTemperature: Int = kelvinsDay - KELVIN_FACTOR
    var nightTemperature: Int = kelvinsNight - KELVIN_FACTOR

    init {
        printWeatherReport()
    }

    fun printWeatherReport() {
        println("Дневная температура: $dayTemperature°C, Ночная температура: $nightTemperature°C, Наличие осадков: $isPrecipitation")
    }

}
const val KELVIN_FACTOR = 273

fun main() {

 val daysList = mutableListOf<WeatherRep>()

    for (i in 1 until 30) {
    daysList.add(WeatherRep(Random.nextInt(265, 275), Random.nextInt(265, 275), Random.nextBoolean()))
}
    val dayTemp = daysList.map { it.dayTemperature }
    val nightTemp = daysList.map { it.nightTemperature }

    val avarageDayTemp = dayTemp.average().toInt()
    val avarageNightTemp = nightTemp.average().toInt()

    val precipitationDaysCount = daysList.count {it.isPrecipitation}

    println("Средняя дневная температура: ${avarageDayTemp}°C.")
    println("Средняя ночная температура: $avarageNightTemp°C.")
    println("Количество дней с осадками: $precipitationDaysCount.")
}