package org.example.lesson_12

class WeatherReporting(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isPrecipitation: Boolean,
) {
    fun printWeatherReport() {
        println("Дневная температура: $dayTemperature, Ночная температура: $nightTemperature, Наличие осадков: $isPrecipitation")
    }
}

fun main() {
    val day1 = WeatherReporting(12, 5,true)
    val day2 = WeatherReporting(13, 3,true)


    day1.printWeatherReport()
    day2.printWeatherReport()

}