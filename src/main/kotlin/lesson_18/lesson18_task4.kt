package org.example.lesson_18

open class Box {
    open fun surfaceArea(): Double {
        return 0.0
    }
}

class RectangleBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Box() {
    override fun surfaceArea(): Double {
        return 2.0 * (length * width + length * height + width * height)
    }
}

class Cube(
    private val edgeLength: Double,
) : Box() {
    override fun surfaceArea(): Double {
        return 6 * edgeLength * edgeLength
    }
}

fun main() {
    val rectangleBox = RectangleBox(15.0, 20.0, 30.0)
    val cube = Cube(20.0)

    println("Площадь поверхности прямоугольной коробки: ${rectangleBox.surfaceArea()} кв.ед.")
    println("Площадь поверхности куба: ${cube.surfaceArea()} кв.ед.")
}