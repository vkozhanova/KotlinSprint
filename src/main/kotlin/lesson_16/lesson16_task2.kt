package org.example.lesson_16

import kotlin.math.pow

class Circle(
    private val radius: Double = 0.0,
) {
    companion object {
        private const val PI: Double = 3.14
    }

    fun getCircumference(): Double {
        return (radius * 2) * PI
    }

    fun getCircleArea(): Double {
        return radius.pow(2) * PI
    }
}

fun main() {
    val circle = Circle(6.0)

    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getCircleArea()}")
}