package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    fun loadPassenger()
    fun unloadPassenger()
}

interface CargoTransport {
    fun loadCargo(weight: Double)
    fun unloadCargo(weight: Double)

}

class Car(
    val maxPassengers: Int = 3,
    var currentPassengers: Int = 0,
) : Movable, PassengerTransport {

    override fun move() {
        println("Легковой автомобиль движется, кол-во пассажиров: $currentPassengers.")
    }

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Автомобиль загружен, кол-во пассажиров: $currentPassengers.")
        } else {
            println("Автомобиль загружен полностью и не может вместить больше пассажиров.")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир выгружен. Текущее кол-во пассажиров: $currentPassengers.")
        } else {
            println("Пассажиров для выгрузки нет.")
        }
    }
}

class Truck(
    val maxCargoWeight: Double = 2.0,
    var currentCargoWeight: Double = 0.0,
    var currentPassengers: Int = 0,
) : Movable, PassengerTransport, CargoTransport {

    override fun move() {
        println("Грузовой автомобиль движется, кол-во пассажиров: $currentPassengers, кол-во груза: $currentCargoWeight тонн.")
    }

    override fun loadPassenger() {
        if (currentPassengers < 1) {
            currentPassengers++
            println("Пассажир загружен, кол-во пассажиров: $currentPassengers.")
        } else {
            println("Грузовой автомобиль может перевозить только одного пассажира.")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир выгружен. Текущее кол-во пассажиров: $currentPassengers.")
        } else {
            println("Пассажиров для выгрузки нет.")
        }
    }

    override fun loadCargo(weight: Double) {
        if (currentCargoWeight + weight <= maxCargoWeight) {
            currentCargoWeight += weight
            println("Груз загружен. Кол-во груза: $currentCargoWeight тонн.")
        } else {
            println("Недостаточно метса для груза.")
        }
    }

    override fun unloadCargo(weight: Double) {
        if (currentCargoWeight >= weight) {
            currentCargoWeight -= weight
            println("Груз выгружен. Текущее кол-во груза: $currentCargoWeight тонн.")
        } else {
            println("Недостаточно груза для выгрузки.")
        }
    }
}

fun main() {
    val car = Car()
    val truck = Truck()

    for (i in 1..6) {
        car.loadPassenger()
    }
    car.move()

    truck.loadCargo(1.5)
    truck.loadCargo(0.5)

    truck.loadPassenger()
    truck.move()

    truck.unloadCargo(2.0)
    truck.unloadPassenger()
}


