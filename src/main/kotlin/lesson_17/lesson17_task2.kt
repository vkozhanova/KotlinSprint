package org.example.lesson_17

class Ship(_name: String) {

    var averageSpeed: Double = 0.0
    var homePort: String = " "

    var name: String = _name
        get() = field
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

    val ship = Ship("Ship1")
    ship.changeAverageSpeed(21.0)
    ship.changeHomePort("Мурманск")
    println(ship)

    ship.name = "Ship2"
    println(ship.name)
}