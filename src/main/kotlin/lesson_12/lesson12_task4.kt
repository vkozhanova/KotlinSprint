package org.example.lesson_12

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

    val day1 = WeatherRep(273, 263, true)
    val day2 = WeatherRep(276, 260, false)

}
