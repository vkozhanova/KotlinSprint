package org.example.lesson_9

fun main() {
    val omeletteAmount: List<Int> = listOf(2, 50, 15)
    println("Введите количество порций для рассчета:")
    val userInput = readln().toInt()
    val userAmount = omeletteAmount.map { it * userInput }
    println("На количество порций $userInput вам понадобится:" +
            " яиц - ${userAmount[0]}шт," +
            " молока - ${userAmount[1]}мл," +
            " сливочного масла - ${userAmount[2]}гр.")
}