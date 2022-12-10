package Homework3

class Task03_050422_Nik {
}
fun main() {
    print("как тебя зовут: ")
    val name = readLine()!!.toString()
    println("какой твой любимый предмет: ")
    val subject = readLine()!!.toString()
    if (subject == "химия") {
        println("$name ты будешь химиком")
    } else if (subject == "математика") {
        println("$name ты будушь математиком ")
    } else if (subject == "рисование") {
        println("$name ты будушь художником ")}
    else if (subject == "окружающий мир") {
        println("$name ты будушь ученым ")}
    else if (subject == "история") {
        println("$name ты будушь историком ")}
    else {
        println("твое будущее туманно $name")
}}