package Kotlin.Lessons.Lesson4.Temp

import kotlin.Throws
import java.lang.InterruptedException
import kotlin.jvm.JvmStatic

object ReturnBack {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        print("Hallo")
        Thread.sleep(1000)
        println("\r\r\r\r\rNot Hallo")
    }
}