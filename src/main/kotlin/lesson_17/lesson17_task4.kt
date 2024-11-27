package org.example.lesson_17

class Package(val trackingNumber: String) {

    private var _currentLocation: String = "На складе"
    private var _movementCount: Int = 0

    val currentLocation: String
        get() = _currentLocation

    val movementCount: Int
        get() = _movementCount

    var location: String
        get() = _currentLocation
        set(value) {
            _currentLocation = value
            _movementCount++
        }
}

fun main() {
    val package1 = Package("12AB13")
    println("Номер посылки: ${package1.trackingNumber}, текущее местоположение: ${package1.currentLocation}, счетчик перемещений: ${package1.movementCount}")

    package1.location = "Пункт отбработки1"
    package1.location = "Пункт сортировки"
    println("Номер посылки: ${package1.trackingNumber}, текущее местоположение: ${package1.currentLocation}, счетчик перемещений: ${package1.movementCount}")
}