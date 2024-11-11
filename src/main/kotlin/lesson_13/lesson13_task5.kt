package org.example.lesson_13

class PersonalContacts (val name: String, val number: Long?, val company: String? = null) {
    override fun toString(): String {
       return "Имя: $name, Номер: $number, Компания: ${company ?: "<не указана>"}."
    }
}
fun main() {
  val contactList = mutableListOf<PersonalContacts>()

    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    val inputNumber = readln()
    val number = inputNumber.let {
        try {
            it.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка! Введено не число.")
            null
        }
    }
    println("Введите название компании или оставьте пустым:")
    val company = readln().takeIf { it.isNotBlank() }
    if(number != null) {
        val newContact = PersonalContacts(name, number, company)
        contactList.add(newContact)
        println("Контакт добавлен: $newContact")
    } else {
        println("Контакт не добавлен. Некорректный ввод номера телефона.")
    }
}