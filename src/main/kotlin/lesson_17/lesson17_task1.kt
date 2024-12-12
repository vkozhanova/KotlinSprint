package org.example.lesson_17

class Quiz(
    private val _question: String,
    var _answer: String,
) {
    val question: String = _question

    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz1 = Quiz("question1", "answer1")
    println(quiz1.question)
    println(quiz1.answer)

    quiz1.answer = "answer2"
    println(quiz1.answer)
}