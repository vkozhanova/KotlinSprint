package org.example.lesson_17
class Package(val trackingNumber: String) {

    private var _location: String = "На складе"
    private var _movementCount: Int = 0

    var location: String
        get() = _location
        set(value) {
            _location = value
            _movementCount++
        }

    val movementCount: Int
        get() = _movementCount
}

fun main() {
    val package1 = Package("12AB13")
    println("Номер посылки: ${package1.trackingNumber}, текущее местоположение: ${package1.location}, счетчик перемещений: ${package1.movementCount}")

    package1.location = "Пункт отбработки1"
    package1.location = "Пункт сортировки"
    println("Номер посылки: ${package1.trackingNumber}, текущее местоположение: ${package1.location}, счетчик перемещений: ${package1.movementCount}")
}