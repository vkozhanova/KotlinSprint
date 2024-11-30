package org.example.lesson_14

open class Liner(
    open val name: String,
    open val speed: Int = 40,
    open val passengerCapacity: Int = 200,
) {
    open fun printInfo() {
        println("Корабль класса Лайнер, имя: $name, скорость: $speed, вместимость: $passengerCapacity.")
    }
}

class CargoShip(
    name: String,
    speed: Int = 30,
    passengerCapacity: Int = 150,
    val cargoCapacity: Int = 1000,
) : Liner(name, speed, passengerCapacity) {
    override fun printInfo() {
        println(
            "Корабль класса Грузовой, имя: $name, скорость: $speed," +
                    " вместимость: $passengerCapacity," +
                    " грузоводъемность: $cargoCapacity."
        )
    }
}

class Icebreaker(
    name: String,
    speed: Int = 15,
    passengerCapacity: Int = 30,
    val isIcebreaking: Boolean = true,
    val iceClass: String = "Arc5",
    val isAtomic: Boolean = false

) : Liner(name, speed, passengerCapacity) {
    override fun printInfo() {
        println(
            "Корабль класса Ледокол, имя: $name, скорость: $speed," +
                    " вместимость: $passengerCapacity, возможность колоть лед: $isIcebreaking," +
                    " ледовый класс: $iceClass," +
                    " наличие атомной энергетической установки: $isAtomic."
        )
    }
}

fun main() {
    val liner = Liner("First")
    val cargoShip = CargoShip("Second")
    val icebreaker = Icebreaker("Third")

    liner.printInfo()
    cargoShip.printInfo()
    icebreaker.printInfo()
}
