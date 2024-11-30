package org.example.lesson_15

interface Flyable {

    fun fly() {
        println("")
    }
}

interface Swimmable {
    fun swim() {
        println("")
    }
}

class Duck() : Flyable, Swimmable {
    override fun fly() {
        println("Утки обладают хорошо развитыми крыльями, которые позволяют им совершать перелёты. ")
    }

    override fun swim() {
        println("Утки плавают по воде, ныряют на глубину за водорослями или мелкими беспозвоночными.")
    }
}

class Crucian() : Swimmable {
    override fun swim() {
        println("Караси плавают на небольшой глубине, они хорошо адаптированы к жизни в стоячей или медленно текущей воде.")
    }
}

class Seagull() : Flyable, Swimmable {
    override fun fly() {
        println(
            "Чайки могут парить в воздухе, ловить воздушные потоки и планировать на больших расстояниях." +
                    " Так же они способны быстро менять направление полета и маневрировать."
        )
    }

    override fun swim() {
        println("Чайки плавают по воде, ныряют на глубину за добычей.")
    }
}

fun main() {

    val duck = Duck()
    duck.fly()
    duck.swim()
    println()

    val crucian = Crucian()
    crucian.swim()
    println()

    val seagull = Seagull()
    seagull.fly()
    seagull.swim()
}