package org.example.lesson_8

fun main () {
    val viewsDay = arrayOf(100, 200, 400, 150, 200, 400, 300)
    var viewsWeek = 0

    for (i in viewsDay) {
        viewsWeek += i
    }
    println("Просмотров за неделю: $viewsWeek.")
}
