package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {
    if (this.isEmpty()) return null
    return this.entries.maxByOrNull { it.value }?.key
}

fun main() {
    val stats = mapOf(
        "скорость" to 3,
        "сила" to 5,
        "интеллект" to 2,
        "выносливость" to 5
    )
    val maxStat = stats.maxCategory()
    println("Навык с максимальным количетвом опыта: $maxStat")
}