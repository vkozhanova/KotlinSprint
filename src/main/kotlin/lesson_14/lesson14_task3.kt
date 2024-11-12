package org.example.lesson_14

abstract class Figure(
    val color: String,
) {
    abstract fun areaCalculation(): Double

    abstract fun perimeterCalculation(): Double
}

class Circle(
    color: String,
    val radius: Double,

    ) : Figure(color) {
    override fun areaCalculation(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeterCalculation(): Double {
        return MULTIPLIER * Math.PI * radius
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val width: Double,

    ) : Figure(color) {
    override fun areaCalculation(): Double {
        return width * height
    }

    override fun perimeterCalculation(): Double {
        return MULTIPLIER * (width + height)
    }
}

const val MULTIPLIER: Double = 2.0

fun main() {
    val figures = mutableListOf<Figure>()

    figures.add(Circle("white", 5.0))
    figures.add(Circle("black", 4.0))
    figures.add(Rectangle("white", 4.0, 6.0))
    figures.add(Rectangle("black", 7.0, 8.0))

    val blackPerimeterSum = figures.filter { it.color == "black" }.sumOf { it.perimeterCalculation() }
        .also { println("Сумма периметров черных фигур: ${String.format("%.2f", it)}.") }

    val whiteAreaSum = figures.filter { it.color == "white" }.sumOf { it.areaCalculation() }
        .also { println("Сумма площадей всехбелых фигур: ${String.format("%.2f", it)}.") }

}



