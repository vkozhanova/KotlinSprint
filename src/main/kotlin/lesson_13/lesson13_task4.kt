package org.example.lesson_13

class PersonalContacts(val name: String, val number: Long?, val company: String? = null){
    fun displayContact() {
        println("Имя: $name, Номер телефона: $number, Компания: $company")
    }
}

fun main() {
    val contacts = mutableListOf<PersonalContacts>()

    while (true) {
        println("Введите имя контакта (или 'exit' для выхода):")
        val name = readLine() ?: continue
        if (name.lowercase() == "exit") break

        println("Введите номер телефона:")
        val inputNumber = readln().toLongOrNull()

        if (inputNumber == null) {
            println("Номер телефона отсутствует. Контакт не добавлен.")
            continue
        }

        println("Введите название компании (или оставьте поле пустым):")
        val company = readln().takeIf { it.isNotBlank() }

        val contact = PersonalContacts(name, inputNumber, company)
        contacts.add(contact)
    }

    println("Список контактов:")
    for (contact in contacts) {
        contact.displayContact()
    }
}