package org.example.lesson_17
class Package(_trackingNumber: String, _location: String) {

    var movementCount: Int = 1

    val trackingNumber: String = _trackingNumber
        get() = field

    var location: String = _location
        get() = field
        set(value) {
            field = value
            movementCount++
        }
    override fun toString(): String {
        return "Номер посылки: $trackingNumber, текущее местоположение: $location, счетчик перемещений: $movementCount"
    }
}

fun main() {
    val package1 = Package("12AB13", "На складе")
    println(package1.toString())

    package1.location = "Пункт сортировки"
    println(package1.toString())
}