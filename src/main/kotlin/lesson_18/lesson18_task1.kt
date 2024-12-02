package org.example.lesson_18

class Order(val id: Int) {
    fun addItemsToOrder(
        item: String,
    ) {
        println("Заказ №$id, заказан товар: $item.")
    }

    fun addItemsToOrder(
        item: List<String>,
    ) {
        println("Заказ №$id, Заказаны следующие товары: ${item.joinToString(", ")}.")
    }
}

fun main() {

    val order1 = Order(1)
    order1.addItemsToOrder("картина")
    println()

    val order2 = Order(2)
    order2.addItemsToOrder(listOf("картина", "корзина", "картонка"))
    println()
}