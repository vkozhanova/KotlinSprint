package org.example.lesson_16

class Circle(
    private val radius: Double = 0.0,
) {
    private val factor: Double = 3.14

    fun getCircumference(): Double {
        return (radius * 2) * factor
    }

    fun getCircleArea(): Double {
        return radius * radius * factor
    }
}

fun main() {
    val circle = Circle(6.0)

    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getCircleArea()}")
}