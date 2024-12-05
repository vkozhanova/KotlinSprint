package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank() {
    var currentAmmo: Ammo? = null

    fun equipAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк вооружен патронами типа ${ammo.name} с силой урона ${ammo.damage}.")
    }

    fun shoot() {
        if (currentAmmo != null) {
            println("Урон: ${currentAmmo!!.damage}")
        } else {
            println("Танк не заряжен! Урон: 0.")
        }
    }
}

fun main() {

    val tank = Tank()

    tank.shoot()
    tank.equipAmmo(Ammo.BLUE)
    tank.shoot()
    tank.equipAmmo(Ammo.RED)
    tank.shoot()
    tank.equipAmmo(Ammo.GREEN)
    tank.shoot()
}
