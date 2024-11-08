package org.example.lesson_13

class ContactInfo (val name: String, val number: Long, company: String? = null) {

    val company: String? = company

    fun printComtactInfo() {

        println("-Имя: $name")
        println("-Номер телефона: $number")
        println("-Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val person1 = ContactInfo("Иван", 89345782100)
    val person2 = ContactInfo("Мария", 89236452173, "ИнтерТех")

    person1.printComtactInfo()
    println()
    person2.printComtactInfo()
}