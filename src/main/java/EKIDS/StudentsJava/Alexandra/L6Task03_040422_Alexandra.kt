package Java.StudentsJava.Alexandra

import java.util.*
import kotlin.jvm.JvmStatic

object L6Task03_040422_Alexandra {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Вас приветствует программа определения будующей профессии")
        val scan = Scanner(System.`in`)
        println("Введите свое имя, и нажми enter")
        val name = scan.nextLine()
        println("Введи свой любимый предмет в школе: информатика, рисование, математика, физика, физкультура, английский,химия")
        val subject = scan.nextLine()
        when (subject) {
            "информатика" -> println("Возможно ты станешь Программистом")
            "рисование" -> println("Возможно ты станешь Художником")
            "математика" -> println("Возможно ты станешь Математиком")
            "физика" -> println("Возможно ты станешь Физиком")
            "физкультура" -> println("Возможно ты станешь Спортсменом")
            "английский" -> println("Возможно ты станешь Переводчиком")
            "химия" -> println("Возможно ты станешь Химиком")
            else -> println("Вы ввели школьный предмет не из предложенного списка. Попробуйте еще раз. ")
        }
    }
}