package org.example.lesson_5

const val FACTOR = 100.0
fun main() {
    println("Введите расстояние планируемой поездки, км:")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100км, л:")
    val fuel = readln().toDouble()

    println("Введите текущую цену за литр топлива:")
    val cost = readln().toDouble()

    val fuelAmount = (distance * fuel) / FACTOR
    val totalCost = fuelAmount * cost

    println("Количество необходимого топлива для вашей поездки: ${String.format("%.2f", fuelAmount)} л." +
            " Итоговая стоимость поездки составит: ${String.format("%.2f", totalCost)} руб.")
}