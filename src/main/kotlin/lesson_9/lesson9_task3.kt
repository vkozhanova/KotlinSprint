package org.example.lesson_9

fun main() {
    val omeletteAmount: List<Int> = listOf(2, 50, 15)

    println("Введите количество порций для рассчета:")
    val userInput = readln().toInt()
    val userAmount = omeletteAmount.map { it * userInput }

    println("На количество порций $userInput вам понадобится:" +
            " яиц - ${userAmount[EGG_INDEX]}шт," +
            " молока - ${userAmount[MILK_INDEX]}мл," +
            " сливочного масла - ${userAmount[BUTTER_INDEX]}гр.")
}
const val EGG_INDEX = 0
const val MILK_INDEX = 1
const val BUTTER_INDEX = 2
