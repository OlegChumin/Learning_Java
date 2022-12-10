package Kotlin.StudentsKotlin.Gleb

fun main() {
    var subjects = listOf("рисование", "математика", "география", "химия", "литература")
    println("ведите имя пользевателя")
    var name = readLine()!!.toString()
    println(" ваше имя $name.прикрастно!")
    println("какой ваш любимый урок?")
    var subject = readLine()!!.toString()
    if (subject == "рисование") {
        println("ты станешь художником")
    } else if (subject == "математика") {
        println("будешь математиком")
    } else if (subject == "география") {
        println("будешь географом")
    } else if (subject == "химия") {
        println("будешь химиком")

    } else if (subject == "литература")
        println("будешь поэтом ")

}