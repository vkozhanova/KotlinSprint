package org.example.lesson_22

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звездная система к Земле, состоящая из " +
                "трех звезд: Alpha Centauri A, Alpha Centauri B и Proxima Centauri.",
        dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")).toString(),
        distanceFromEarth = 4.367,
    )

    val (name, description, dateTime, distanceFromEarth) = alphaCentauri
    println(
        "Название: $name. \nОписание: $description \nДата и время события: $dateTime. " +
                "\nРасстояние от Земли: $distanceFromEarth световых лет."
    )
}