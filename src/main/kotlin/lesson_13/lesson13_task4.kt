package org.example.lesson_13

class Contacts(val name: String, val number: Long, val company: String? = null)

fun main() {
    val contactList = mutableListOf<Contacts>()

    val person1 = Contacts("Иван", 89345782100)
    val person2 = Contacts("Мария", 89236452173, "ИнтерТех")
    val person3 = Contacts("Елена", 67954356772)
    val person4 = Contacts("Евгений", 45387624512, "ООО Агротек")
    val person5 = Contacts("Антон", 56389752375, "null")

    contactList.addAll(mutableListOf(person1, person2, person3, person4, person5))

    val allCompanies = contactList.mapNotNull { it.company }

    println(allCompanies)
}