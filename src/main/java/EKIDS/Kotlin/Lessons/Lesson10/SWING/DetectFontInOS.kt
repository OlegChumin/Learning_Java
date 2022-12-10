package Kotlin.Lessons.Lesson10.SWING

import java.awt.GraphicsEnvironment

fun main() {
    val fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    for (element in fonts) {
        println(element)
    }
}