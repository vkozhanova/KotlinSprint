package org.example.lesson_22

class Regular(
    val title: String,
    val author: String,
)

data class Data(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = Regular("Воронья Дорога", "Иэн Бэнкс")
    val book2 = Data("Тревожные люди", "Фредерик Бакман")

    println(book1)
    println(book2)
//    Для обычного класса Regular будет выведена строка вида "Regular@52cc8049", так как
//    метод toString() в обычном классе не переопределен и будет выводить имя класса и хэш-код, а не содержимое объекта.
//    Тогда как для data класса Data будет выведено "Data(title=Тревожные люди, author=Фредерик Бакман)",
//    так как data классы автоматически переопределяют toString().
}