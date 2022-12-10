package Kotlin.StudentsKotlin.Gleb

fun main() {

    println("здравстуйте это калькулятор!")
    println("выберите действие диление умножение сложение вычетание")
    val action = readLine()!!.toString()
    val ANSI_YELLOW = "\u001B[33m"
    val ANSI_RESET = "\u001B[0m"
    val math = listOf("сложение", "деление", "вычитание", "умножение")
    if (action == "сложение") {
        println(readLine()!!.toInt() + readLine()!!.toInt())
    }
}

fun sumAplusB(numberA: Int, numberB: Int) {
    println(numberA + numberB)
}





