package Kotlin.StudentsKotlin.Gleb

import kotlin.concurrent.thread

fun main() {
    val ANSI_red = "\u001B[31m"
    val ANSI_RESET = "\u001B[0m"
    for (i in 99 downTo 0) {
        print(ANSI_red + "$i")
        Thread.sleep(250)
        print("\r\r\r")
    }
}
