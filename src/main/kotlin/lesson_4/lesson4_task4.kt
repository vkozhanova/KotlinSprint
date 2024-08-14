package org.example.lesson_4

fun main() {
    val day = 5
    val isArmsAbsDay = day % 2 != 0
    val isLegsBackDay = day % 2 == 0

    val result = """
        Упражнения для рук: $isArmsAbsDay
        Упражнения для ног: $isLegsBackDay
        Упражнения для спины: $isLegsBackDay
        Упражнения для пресса: $isArmsAbsDay
    """.trimIndent()

    println(result)
}