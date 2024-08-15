package org.example.lesson_4

fun main() {
    val day = 5
    val isEven = day % 2 == 0

    val result = """
        Упражнения для рук: ${!isEven}
        Упражнения для ног: $isEven
        Упражнения для спины: $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()

    println(result)
}