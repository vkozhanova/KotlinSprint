package org.example

fun main() {
    val num = 6

    val multiString = """
        $num * 1 = ${1 * num}
        $num * 2 = ${2 * num}
        $num * 3 = ${3 * num}
        $num * 4 = ${4 * num}
        $num * 5 = ${5 * num}
        $num * 6 = ${6 * num}
        $num * 7 = ${7 * num}
        $num * 8 = ${8 * num}
        $num * 9 = ${9 * num}
    """.trimIndent()

    println(multiString)
}