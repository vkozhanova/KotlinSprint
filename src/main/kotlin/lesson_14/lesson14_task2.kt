package org.example.lesson_14

open class Liner(
    val name: String = "",
    val speed: Int = 40,
    val passengerCapacity: Int = 200,
) {
    open fun printInfo() {
        println("Корабль, Имя: $name, Скорость: $speed, Вместимость: $passengerCapacity.")
    }

    open fun loading() {
        println("Началась погрузка на $name.")
        println("Горизонтальный трап со шкафута выдвинут.")
    }
}

class CargoShip(
    name: String = "",
    speed: Int = 30,
    passengerCapacity: Int = 150,
    val cargoCapacity: Int = 1000,
) : Liner(name, speed, passengerCapacity) {
    override fun printInfo() {
       super.printInfo()
        println("Грузоподъемность: $cargoCapacity.")
    }

    override fun loading() {
        println("Началась погрузка на $name.")
        println("Погрузочный кран активирован.")
    }
}

class Icebreaker(
    name: String = "",
    speed: Int = 15,
    passengerCapacity: Int = 30,
    val isIcebreaking: Boolean = true,
    val iceClass: String = "",
    val isAtomic: Boolean = true

) : Liner(name, speed, passengerCapacity) {
    override fun printInfo() {
        super.printInfo()
        println(
            "Возможность колоть лед: $isIcebreaking," +
                    " Ледовый класс: $iceClass," +
                    " Наличие атомной энергетической установки: $isAtomic."
        )
    }

    override fun loading() {
        println("Началась погрузка на $name.")
        println("Ворота со стороны кормы открыты.")
    }
}

fun main() {
    val liner = Liner("First", 40, 200)
    val cargoShip = CargoShip("Second", 30, 150, 1000)
    val icebreaker = Icebreaker("Third", 15, 30, true, "Arc5", false)

    liner.printInfo()
    liner.loading()
    println()

    cargoShip.printInfo()
    cargoShip.loading()
    println()

    icebreaker.printInfo()
    icebreaker.loading()
}