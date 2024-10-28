package org.example.lesson3

fun main() {
    val moveString = "D2-D4;0"

    val (from, separator, moveNum) = moveString.split(";", "-")

    println("Откуда: $from")
    println("Куда: ${separator.substring(0, 2)}")
    println("Номер хода: $moveNum")
}