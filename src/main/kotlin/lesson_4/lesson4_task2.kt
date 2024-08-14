package org.example.lesson_4

fun main() {
    val cargo1 = Pair(20, 80)
    val cargo2 = Pair(50, 100)

    println(
        "Груз с весом ${cargo1.first}кг и объемом ${cargo1.second}л соответствует категории 'Average': " +
                !((cargo1.first <= MIN_WEIGHT) || (cargo1.first > MAX_WEIGHT) || (cargo1.second >= MAX_VOLUME))
    )

    println(
        "Груз с весом ${cargo2.first}кг и объемом ${cargo2.second}л соответствует категории 'Average': " +
                !((cargo2.first <= MIN_WEIGHT) || (cargo2.first > MAX_WEIGHT) || (cargo2.second >= MAX_VOLUME))
    )
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100