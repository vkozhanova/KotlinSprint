package org.example.lesson_19

enum class Category {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getName(): String {
        return when (this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
    }
}

class Item(
    val id: Int,
    val name: String,
    val category: Category,
) {
    fun displayInfo() {
        println("Товар: $name, id: $id, категория: ${category.getName()}.")
    }
}

fun main() {

    val item1 = Item(1, "Брюки", Category.CLOTHING)
    val item2 = Item(2, "Набор карандашей", Category.STATIONERY)
    val item3 = Item(3, "Кружка", Category.MISCELLANEOUS)

    item1.displayInfo()
    item2.displayInfo()
    item3.displayInfo()
}



