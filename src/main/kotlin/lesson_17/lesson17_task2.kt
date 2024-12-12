package org.example.lesson_17
class Ship(
    var _name: String,
    var averageSpeed: Double,
    var homePort: String,
) {
    var name: String = _name
        set(value) {
            println("Имя корабля изменить нельзя.")
        }

    fun changeAverageSpeed(newSpeed: Double) {
        averageSpeed = newSpeed
    }

    fun changeHomePort(newHomePort: String) {
        homePort = newHomePort
    }

    override fun toString(): String {
        return "Корабль $name, средняя скорость: $averageSpeed, порт приписки: $homePort"
    }
}

fun main() {

    val ship = Ship("Ship1", 21.0, "Архангельск")
    println(ship)

    ship.changeHomePort("Санкт-Петербург")
    ship.changeAverageSpeed(23.4)
    println(ship)

    ship.name = "Ship2"
    println(ship.name)
}