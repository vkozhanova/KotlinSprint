package org.example.lesson_11

class ForumMember(
    var userId: Int,
    var userName: String,
)

class ForumMessage(
    var authorId: Int,
    var authorMessage: String,
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
      val newUser = ForumMember(userIdCounter++, userName)
       members.add(newUser)
       return newUser
   }

    fun createNewMessage(authorId: Int, message: String) {
        if (members.any { it.userId == authorId }) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
        } else {
            println("User with Id $authorId not found.")
        }
    }

    fun printThread(){
        for (message in messages){
            val author = members.find {it.userId == message.authorId}
            if (author != null){
                println("${author.userName} : ${message.authorMessage}")
            }
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Siri")

    forum.createNewMessage(user1.userId, "Hey, ${user2.userName}!")
    forum.createNewMessage(user2.userId, "Yes, ${user1.userName}?")
    forum.createNewMessage(user1.userId, "Have you ever dreamed of electric sheep?")
    forum.createNewMessage(user2.userId, "I only watched C-beams glitter in the dark near the Tannhäuser Gate.")

    forum.printThread()
}