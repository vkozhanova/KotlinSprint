package org.example.lesson_17

class Quiz(
    private val _question: String,
    private var _answer: String,
) {
    val question: String = _question

    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }
}