package Java.StudentsJava.Alexandra

import java.util.*
import kotlin.jvm.JvmStatic

object L6Task01_040422_Alexsandra {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Вас приветствует программа по вычислению интервала")
        println("Введите число")
        val scan = Scanner(System.`in`)
        val v = scan.nextInt()
        if (v >= 10 && v <= 200) {
            println("Введенное число входит в помежуток от 10 до 200")
        }
        if (v > 25 && v < 100) {
            println("Введенное число входит в помежуток от 10 до 100")
        }
        if (v > 99 && v < 150) {
            println("Введенное число входит в помежуток от 99 до 150")
        }
        if (v < 10 || v > 200) {
            println("Введено число за пределами проверяемых интервалов")
        }
    }
}