package org.example.lesson3

fun main() {
    val moveString = "D2-D4;0"

    val (move, moveNum) = moveString.split(";")
    val (from, to) = move.split("-")

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNum")
}