package Kotlin.Lessons.Lesson4.Temp

import kotlin.jvm.JvmStatic

/**
 * Имя цвета	Цветовой код	Цвет фона	Код цвета фона
 * ЧЕРНЫЙ	    \u001B[30m	    BLACK_BACKGROUND	\u001B[40m
 * КРАСНЫЙ	\u001B[31m	    RED_BACKGROUND	    \u001B[41m
 * Зеленый	\u001B[32m	    GREEN_BACKGROUND	\u001B[42m
 * Желтый	    \u001B[33m	    YELLOW_BACKGROUND	\u001B[43m
 * Синий	    \u001B[34m	    BLUE_BACKGROUND	    \u001B[44m
 * Фиолетовый	\u001B[35m	    PURPLE_BACKGROUND	\u001B[45m
 * голубой	\u001B[36m	    CYAN_BACKGROUND	    \u001B[46m
 * БЕЛЫЙ	    \u001B[37m	    WHITE_BACKGROUND	\u001B[47m
 */
object ColouredText {
    const val ANSI_RESET = "\u001B[0m"
    const val ANSI_YELLOW = "\u001B[33m"
    @JvmStatic
    fun main(args: Array<String>) {
        println(ANSI_YELLOW + "этот текст окрашен в желтый" + ANSI_RESET)
    }
}