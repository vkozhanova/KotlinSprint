package org.example.lesson_18

abstract class Animal(
    val name: String,
    val diet: String,
) {
    open fun sleep() {
        println("$name -> спит.")
    }

    abstract fun feed()
}

class Fox(
    name: String = "",
    diet: String = "ягоды"
): Animal(name, diet) {

    override fun feed() {
        println("$name -> ест $diet.")
    }
}

class Dog(
    name: String = "",
    diet: String = "кости"
): Animal(name, diet) {

    override fun feed() {
        println("$name -> ест $diet.")
    }
}

class Cat(
    name: String = "",
    diet: String = "рыба"
): Animal(name, diet) {

    override fun feed() {
        println("$name -> ест рыбу.")
    }
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animalsList: List<Animal> = listOf(fox, dog, cat)
    for (i in animalsList) {
        i.feed()
    }
}