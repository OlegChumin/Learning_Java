package Kotlin.Lessons.Lesson10.SWING

import java.awt.Toolkit
import javax.swing.JFrame

fun main() {
    val sW = JFrame()
    sW.isVisible = true
    sW.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    val toolkit = Toolkit.getDefaultToolkit()
    val dimension = toolkit.screenSize
    sW.setBounds(dimension.width / 2 - 320, dimension.height / 2 - 240,640, 480)
    sW.title = "Simple window"
}