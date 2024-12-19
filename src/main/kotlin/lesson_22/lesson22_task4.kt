package org.example.lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = false)
        println("Состояние: отсутствие данных.")
        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: загрузка данных...")
        Thread.sleep(2000)

        val loadedData = "Данные загружены с сервера."
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)
        println("Состояние: $loadedData")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}