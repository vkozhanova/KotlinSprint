package org.example.lesson_5

const val FACTOR = 100.0
fun main() {
    println("Введите ваш вес, кг:")
    val weight = readln().toDouble()

    println("Введите ваш рост, см:")
    val height = readln().toDouble()

    val bmi = weight / ((height / FACTOR).let { it * it })

    val result = ("Ваш ИМТ равен: ${String.format("%.2f", bmi)}")

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25 -> "Нормальная масса тела"
        bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(result)
    println(category)
}
