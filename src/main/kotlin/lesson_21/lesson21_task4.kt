package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("textFile.txt")

    file.writeWordToStart("Привет")
    file.writeWordToStart("Добро пожаловать")

    println(file.readText())
}

fun File.writeWordToStart(word: String) {
    val lowerCaseWord = word.lowercase()
    if(!this.exists()) {
        this.createNewFile()
    }
    val currentContent = this.readText()
    this.writeText("$lowerCaseWord\n$currentContent")
}