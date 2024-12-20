package org.example.lesson_18

abstract class Screen {

    abstract fun draw(x: Int, y: Int): String

    abstract fun draw(x: Float, y: Float): String
}

class Circle : Screen() {

    override fun draw(x: Int, y: Int): String {
        return "Нарисован круг с координатами $x и $y."
    }

    override fun draw(x: Float, y: Float): String {
        return "Нарисован круг с координатами $x и $y."
    }
}

class Square : Screen() {

    override fun draw(x: Int, y: Int): String {
        return "Нарисован квадрат с координатами $x и $y."
    }

    override fun draw(x: Float, y: Float): String {
        return "Нарисован квадрат с координатами $x и $y."
    }
}

class Point : Screen() {

    override fun draw(x: Int, y: Int): String {
        return "Нарисована точка с координатами $x и $y."
    }

    override fun draw(x: Float, y: Float): String {
        return "Нарисована точка с координатами $x и $y."
    }
}

fun main() {

    val circle = Circle()
    val square = Square()
    val point = Point()

    println(circle.draw(3, 5))
    println(circle.draw(3.9f, 6.0f))

    println(square.draw(5, 5))
    println(square.draw(4.5f, 5.5f))

    println(point.draw(7, 8))
    println(point.draw(7.7f, 1.6f))
}