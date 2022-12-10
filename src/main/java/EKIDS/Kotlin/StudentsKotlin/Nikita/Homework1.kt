package Kotlin.StudentsHomeWorks.Nelly

fun main() {
    print("Введите число 1: ")
    val number1 = readLine()!!.toInt()
    print ("Введите число 2: ")
    val number2 = readLine()!!.toInt()
    println ("Число 1 : $number1")
    println ("Число 2 : $number2")
    val sum = number1+number2
    println("Сумма: $sum ")
    val pro = number1*number2
    println("Произведение: $pro")
}