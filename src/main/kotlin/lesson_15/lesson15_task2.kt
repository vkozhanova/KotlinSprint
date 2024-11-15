package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun getInfo(): String
}

class Temperature(val value: Double) : WeatherStationStats() {
    override fun getInfo(): String {
        return "Температура: $value °C."
    }
}

class PrecipitationAmount(val amount: Double) : WeatherStationStats() {
    override fun getInfo(): String {
        return "Количество осадков: $amount мм."
    }
}

class  WeatherServer {
        fun sendInfo(weatherInfo: WeatherStationStats){
            println("Отправка данных на сервер...")
            println(weatherInfo.getInfo())
        }
    }

fun main() {
    val temperature = Temperature(6.0)
    val precipitations = PrecipitationAmount(10.0)
    val server = WeatherServer()

    server.sendInfo(temperature)
    server.sendInfo(precipitations)
}