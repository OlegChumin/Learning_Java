package Kotlin

import javax.swing.JFrame
import javax.swing.WindowConstants
import kotlin.jvm.JvmStatic

/**
 * SWING
 */
open class MainWindow : JFrame() {
    init {
        title = "Игра змейка" // создаем заголовок окна игры
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE // отработали закрытие окна
        setSize(320, 345) // создаем окно размером 320 на 345 пикселей
        setLocation(400, 400) // задаем начальное положение окна по левому верхнему углу
        isVisible = true
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mw = MainWindow()
        }
    }
}