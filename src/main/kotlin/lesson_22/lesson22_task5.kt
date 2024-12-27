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
        "Alpha Centauri",
        "Ближайшая звездная система к Земле, состоящая из " +
                "трех звезд: Alpha Centauri A, Alpha Centauri B и Proxima Centauri.",
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")),
         4.367,
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println(
        "Название: $name. \nОписание: $description \nДата и время события: $dateTime. " +
                "\nРасстояние от Земли: $distanceFromEarth световых лет."
    )
}