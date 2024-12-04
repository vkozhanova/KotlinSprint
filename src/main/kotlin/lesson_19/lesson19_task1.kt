package org.example.lesson_19

enum class FishType(val fishName: String) {
        GUPPY("Гуппи"),
        ANGELFISH("Скалярия"),
        GOLDFISH("Золотая рыбка"),
        SIAMESE_FIGHTING_FISH("Петушок"),
    }

fun main() {

    println("вы можете добавить в аквариум следующие виды рыб:")
    FishType.values().forEach { fish -> println("- ${fish.fishName}") }
}

