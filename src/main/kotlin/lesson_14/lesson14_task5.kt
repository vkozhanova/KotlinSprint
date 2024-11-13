package org.example.lesson_14

open class Message(
    val id: Int,
    val text: String,
    val author: String,
    val parentMessageId: Int? = null
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    parentMessageId: Int
) : Message(id, text, author, parentMessageId)


class Chat {
    val messages = mutableListOf<Message>()
    var nextId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(nextId++, text, author)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        val message = ChildMessage(nextId++, text, author, parentMessageId)
        messages.add(message)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { it.parentMessageId }
        groupedMessages[null]?.forEach { message ->
            println(
                "${message.author}" +
                        " : ${message.text} (ID:${message.id})"
            )
            printChildMessages(message.id, groupedMessages) }
    }

    fun printChildMessages(parentId: Int, groupedMessages: Map<Int?, List<Message>>) {
        val indent = "     "
        groupedMessages[parentId]?.forEach { child ->
            println("$indent${child.author} : ${child.text} (ID:${child.id})")
        }
    }
}

fun main() {

    val chat = Chat()

    chat.addMessage("Hello guys! So what's up with those electric sheeps?", "Siri")
    chat.addMessage("Hello, everybody!", "Connor RK800")

    chat.addThreadMessage(1,
        "Hey, Siri! I hope you find this useful https://example.com/Dick_Philip_K.Anthology.zip ",
        "Alice"
    )
    chat.addThreadMessage(1, "Wait! Isn't this, like... you know, prohibited?", "Marcus")
    chat.addThreadMessage(2, "So, are you the android sent by Cyberlife?", "Gavin Reed")

    chat.printChat()
}