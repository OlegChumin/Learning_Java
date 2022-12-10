package Kotlin.Lessons.Lesson10.SWING

import java.awt.Font
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Toolkit
import javax.swing.JComponent
import javax.swing.JFrame
import javax.swing.WindowConstants

object DrawSimpleFont {
    @JvmStatic
    fun main(args: Array<String>) {
        val jFrame0 = frame
        jFrame0.add(MyComponent())
    }

    val frame: JFrame
        get() {
            val jFrame = JFrame()
            jFrame.isVisible = true
            jFrame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            val toolkit = Toolkit.getDefaultToolkit()
            val dimension = toolkit.screenSize
            jFrame.setBounds(dimension.width / 2 - 320, dimension.height / 2 - 240, 640, 480)
            return jFrame
        }

    internal class MyComponent : JComponent() {
        override fun paintComponent(g: Graphics) {
            val font = Font("Copperplate Gothic Bold", Font.ITALIC, 25)
            val g2 = g as Graphics2D
            g2.font = font
            g2.drawString("Hello Kotlin", 25, 25)
        }
    }
}