package org.example.lesson_14

open class СelestialObject(
    val name: String,
    val isHaveAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    isHaveAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : СelestialObject(name, isHaveAtmosphere, isSuitableForLanding) {
    val satellites = mutableListOf<Satellite>()

    fun addSatellite(satellite: Satellite): List<Satellite> {
        satellites.add(satellite)
        return satellites
    }


    fun printInfo() {
        println(
            "Планета: $name. Наличие атмосферы: ${if (isHaveAtmosphere) "да" else "нет"}." +
                    " Подходит ли для высадки: ${if (isSuitableForLanding) "да" else "нет"}."
        )
        println("Спутники:")
        if (satellites.isEmpty()) {
            println(" спутников нет.")
        } else {
            for (satellite in satellites) {
                println(
                    " - ${satellite.name}. Наличие атмосферы: ${if (satellite.isHaveAtmosphere) "да" else "нет"}." +
                            " Подходит ли для высадки: ${if (satellite.isSuitableForLanding) "да" else "нет"}."
                )
            }
        }
    }
}

class Satellite(
    name: String,
    isHaveAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : СelestialObject(name, isHaveAtmosphere, isSuitableForLanding)

fun main() {

    val planet = Planet("Татуин", true, false)

    val satellite1 = Satellite("Гомрассен", false, false)
    val satellite2 = Satellite("Гермесса", false, true)
    val satellite3 = Satellite("Шенини", true, true)

    planet.addSatellite(satellite1)
    planet.addSatellite(satellite2)
    planet.addSatellite(satellite3)

    planet.printInfo()
}
