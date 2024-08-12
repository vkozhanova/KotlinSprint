package org.example.lesson_1

fun main() {
    val timeInSpace = 6480
    val minutesInSpace = timeInSpace / TIME

    val minutes = timeInSpace / TIME - TIME
    val hours = minutesInSpace / TIME
    val seconds = minutes / TIME

    println("Гагарин провел в космосе: %02d:%02d:%02d".format(hours,minutes,seconds))

}
const val TIME = 60

