package org.example.lesson_17
class  Folder(
    private var _name: String,
    private var _filesCount: Int,
    private var _isSecret: Boolean,
) {
    var name: String
        get() = if (_isSecret) "Скрытая папка" else _name
        private set(value) {
            if (!_isSecret) {
                _name = value
            }
        }

    val filesCount: Int
        get() = if (_isSecret) 0 else _filesCount
}

fun main() {

    val folder = Folder("Моя папка", 4, false)
    val folder1 = Folder("ДискD", 12, true)

    println("Имя папки: ${folder.name}")
    println("Количество файлов: ${folder.filesCount}")

    println("Имя папки: ${folder1.name}")
    println("Количество файлов: ${folder1.filesCount}")
}