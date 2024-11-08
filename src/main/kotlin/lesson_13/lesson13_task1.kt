package org.example.lesson_13

class ContactInfo(val name: String, val number: Long, val company: String? = null) {

    fun printComtactInfo() {

        println("Имя: $name, Номер телефона: $number, Компания: ${company ?: " "}")
    }
}

fun main() {
    val person1 = ContactInfo("Иван", 89345782100)
    val person2 = ContactInfo("Мария", 89236452173, "ИнтерТех")

    person1.printComtactInfo()
    person2.printComtactInfo()
}