package Kotlin.Lessons.Lesson10.SWING

import javax.swing.JFrame

fun main() {
    val newWindow = JFrame()
    newWindow.isVisible = true
    newWindow.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    newWindow.title = "Мое окно"
    newWindow.setSize(640, 480)
    newWindow.setLocation(320, 240)
}