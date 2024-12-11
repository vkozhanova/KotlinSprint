package org.example.lesson_20

fun main() {
    val strings =
        listOf("Строка1", "Строка2", "Строка3", "Строка4", "Строка5", "Строка6", "Строка7", "Строка8", "Строка9")

    val actions = strings.map { string ->
        { println("Нажат элемент $string.") }
    }
    actions.forEachIndexed { index, action ->
        if (index % 2 == 0) {
            action()
        }
    }
}
