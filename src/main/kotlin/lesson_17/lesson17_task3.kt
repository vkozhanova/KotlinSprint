package org.example.lesson_17

class Folder(name: String, _filesCount: Int) {

    var isSecret: Boolean = false

    val folderName: String = name
        get() = if (isSecret) "Скрытая папка" else field

    val filesCount: Int = _filesCount
        get() = if (isSecret) 0 else field
}

fun main() {

    val folder = Folder("Моя папка", 4)
    folder.isSecret = false
    val folder1 = Folder("ДискD", 12)
    folder1.isSecret = true

    println("Имя папки: ${folder.folderName}")
    println("Количество файлов: ${folder.filesCount}")

    println("Имя папки: ${folder1.folderName}")
    println("Количество файлов: ${folder1.filesCount}")
}