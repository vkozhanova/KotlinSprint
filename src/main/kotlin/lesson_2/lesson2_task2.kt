package org.example.lesson_2
fun main() {
    val workerSal = 30000
    val internSal = 20000

    val workersCount = 50
    val internCount = 30

    val workersPayment = workersCount * workerSal
    println("Расходы на выплаты постоянных сотрудников: $workersPayment")

    val sumPayment = (workerSal * workersCount) + (internSal * internCount)
    println("Общие расходы по ЗП после прихода стажеров: $sumPayment")

    val medianSal = sumPayment / (workersCount + internCount)
    println("Средняя ЗП одного сотрудника после устройства стажеров: $medianSal")

}

