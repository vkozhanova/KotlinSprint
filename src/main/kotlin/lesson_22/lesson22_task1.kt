package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("Воронья Дорога", "Иэн Бэнкс")
    val regularBook2 = RegularBook("Воронья Дорога", "Иэн Бэнкс")

    val dataBook1 = DataBook("Тревожные люди", "Фредерик Бакман")
    val dataBook2 = DataBook("Тревожные люди", "Фредерик Бакман")

    println(regularBook1 == regularBook2)
//  false, потому, что обычные классы не переопределяют equals(),
//  поэтому при сравнении экземпляров класса RegularBook сравниваются ссылки на объекты, а не свойства.
    println(dataBook1 == dataBook2)
//   true, потому, что data классы переопределяют метод equals(),
//   и поэтому при сравнении экземпляров класса DataBook сравниваются свойства.
}