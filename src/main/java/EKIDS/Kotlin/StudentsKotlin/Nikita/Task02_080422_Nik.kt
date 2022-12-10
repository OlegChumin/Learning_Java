package Homework4

class Task02_080422_Nik {
}

fun main() {
 val ANSI_YELLOW = "\u001B[33m"
 val ANSI_RESET = "\u001B[0m"
 print("Введите число 1: ")
 val number1 = readLine()!!.toInt()
 print ("Введите число 2: ")
 val number2 = readLine()!!.toInt()
 println ("Число 1 : $number1")
 println ("Число 2 : $number2")
 print("Введите действие: ")
 val sum = readLine()!!.toString()
  if (sum == "+") {
   println(ANSI_YELLOW +" ${number1+number2}"+ ANSI_RESET)
  } else if (sum =="-") {
   println(ANSI_YELLOW +" ${number1 - number2}"+ ANSI_RESET)
  } else if (sum =="*") {
   println(ANSI_YELLOW +" ${number1 * number2}"+ ANSI_RESET)
  } else if (sum =="/") {
   println(ANSI_YELLOW + " ${number1 / number2}" + ANSI_RESET)
  } else if (sum =="%") {
   println(ANSI_YELLOW + " ${number1 % number2}" + ANSI_RESET)
  } }


