package org.example.lesson_12

class WeatherReport(
    var dayTemperature: Int = 10,
    var nightTemperature: Int = 2,
    var isPrecipitation: Boolean = false,
) {
    fun printWeatherReport() {
        println("Дневная температура: $dayTemperature, Ночная температура: $nightTemperature, Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val day1 = WeatherReport()
    val day2 = WeatherReport()

    day1.dayTemperature = 12
    day1.nightTemperature = 5
    day1.isPrecipitation = true

    day2.dayTemperature = 13
    day2.nightTemperature = 3
    day2.isPrecipitation = true

    day1.printWeatherReport()
    day2.printWeatherReport()

}