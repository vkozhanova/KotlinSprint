package org.example.lesson_1

fun main() {
    val timeInSpace = 6480
    val minutesInSpace = timeInSpace/60

    val minutes = timeInSpace / 60 - 60
    val hours = minutesInSpace / 60
    val seconds = minutes / 60
    
    println("Гагарин провел в космосе $hours:$minutes:0$seconds")

}