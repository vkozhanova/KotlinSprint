package org.example.lesson_20

class Robot {
    private val greetings = listOf(
        "Добро пожаловать!",
        "Привет! Доброго времени суток!",
        "Здравствуйте, рады приветствовать вас!",
        "Привет, как дела?",
        "Какой прекрасный день!"
    )

   private var modifier: ((String) -> String)? = null

    fun say() {
        val randomString = greetings.random()
        val modPhrase = modifier?.invoke(randomString) ?: randomString
        println(modPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()
    robot.say()

    robot.setModifier { randomString -> randomString.split(" ").joinToString(" ") { it.reversed() } }

    robot.say()
}