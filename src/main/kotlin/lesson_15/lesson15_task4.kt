package org.example.lesson_15

interface Searchable {
    fun findComponents(): String
}

open class Item(
    val name: String,
    val quantity: Int,
) {
    override fun toString(): String {
        return "Товар (Наименование: $name, Количество: $quantity шт.)"
    }
}

class Instrument(
    name: String,
    quantity: Int,
) : Item(name, quantity), Searchable {
    override fun findComponents(): String {
        return "Выполняется поиск комплектующих для $name..."
    }
}

class Component(
    name: String,
    quantity: Int,
) : Item(name, quantity)

fun main() {

    val violin = Instrument("Скрипка 4/4", 3)
    val violinStrings = Component("Струны для скрипки 4/4, синтетические", 15)

    println(violin)
    println(violinStrings)

    println(violin.findComponents())
}