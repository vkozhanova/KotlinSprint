package org.example.lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "Состояние: отсутствие данных.", isLoading = false)
        println(mainScreenState.data)
        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(data = "Состояние: загрузка данных...", isLoading = true)
        println(mainScreenState.data)
        Thread.sleep(2000)


        mainScreenState = mainScreenState.copy(data = "Данные загружены с сервера.", isLoading = false)
        println(mainScreenState.data)
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData()
}