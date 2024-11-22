package org.example.lesson_16

class Order(
    private val orderId: Int,
) {
    private var status: String = "Новый"

    fun getStatus(): String {
        return status
    }

    fun requestStatusChange(newStatus: String) {
        println("Отправка завяки на изменение статуса заказа $orderId")
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа $orderId изменен на '$status'.")
    }
}

fun main() {
val order = Order(23)

    println("Статус заказа: ${order.getStatus()}")

    order.requestStatusChange("Оплачен")
    println("Статус заказа: ${order.getStatus()}")

    order.requestStatusChange("В обработке")
    println("Статус заказа: ${order.getStatus()}")
}

