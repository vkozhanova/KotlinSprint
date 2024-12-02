package org.example.lesson_18

open class Animal(
    val name: String,
    val diet: String,
) {
    open fun sleeping() {
        println("$name -> спит.")
    }
    open fun feeding() {
        println("$name -> ест $diet.")
    }
}

class Fox(
    name: String = "",
    diet: String = "ягоды"
): Animal(name, diet)

class Dog(
    name: String = "",
    diet: String = "кости"
): Animal(name, diet)

class Cat(
    name: String = "",
    diet: String = "рыба"
): Animal(name, diet) {
    override fun feeding() {
        println("$name -> ест рыбу.")
    }
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animalsList: List<Animal> = listOf(fox, dog, cat)
    for (i in animalsList) {
        i.feeding()
    }
}