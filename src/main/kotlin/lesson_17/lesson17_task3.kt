package org.example.lesson_17

class Folder(
    private val name: String,
    private var filesCount: Int,
    private var isSecret: Boolean,
) {
    fun getFolderName(): String = if (isSecret) "Скрытая папка" else name
    fun getFilesCount(): Int = if (isSecret) 0 else filesCount
}

fun main() {

    val folder = Folder("Моя папка", 4, false)
    val folder1 = Folder("ДискD", 12, true)

    println("Имя папки: ${folder.getFolderName()}")
    println("Количество файлов: ${folder.getFilesCount()}")

    println("Имя папки: ${folder1.getFolderName()}")
    println("Количество файлов: ${folder1.getFilesCount()}")
}