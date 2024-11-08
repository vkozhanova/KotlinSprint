package org.example.lesson_13

class Contact(val name: String, val number: Long, val company: String? = null)

fun main() {
    val contactList = mutableListOf<Contact>()

    val person1 = Contact("Иван", 89345782100)
    val person2 = Contact("Мария", 89236452173, "ИнтерТех")
    val person3 = Contact("Елена", 67954356772)
    val person4 = Contact("Евгений", 45387624512, "ООО Агротек")
    val person5 = Contact("Антон", 56389752375, "null")

    contactList.addAll(mutableListOf(person1, person2, person3, person4, person5))

    val allCompanies = contactList.mapNotNull { it.company }

    println(allCompanies)
}

