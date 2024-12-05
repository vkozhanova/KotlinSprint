package org.example.lesson_19

class SpaceShip {

    fun takeOff() {
        println("Корабль взлетает.")
//        TODO(): добавить логику для проверки состояния систем.
    }

    fun landing() {
        println("Корабль приземляется.")
//        TODO(): добавить логику для проверки возможности приземления и состояния систем.
    }

    fun shooting() {
        throw NotImplementedError("Метод shooting() не реализован. Необходимо добавить логику" +
                " определения попадания и нанесения повреждений.")
    }
}

fun main() {
    val spaceShip = SpaceShip()

    spaceShip.takeOff()
    spaceShip.landing()
    spaceShip.shooting()
}