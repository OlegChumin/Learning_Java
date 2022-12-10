package Homework3

import java.util.Scanner

class Task01_050422_Nik {
}
fun main() {
    print ("Введите целое число от 10 до 200: ")
    var scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    if (number in 25 ..100) {println("число $number попадает в интервал 1.")}
    else if (number in 99..150)  {
        println("число $number попадает в интервал 2.")} else{
        println("число $number не попадает в интервалы")}
}