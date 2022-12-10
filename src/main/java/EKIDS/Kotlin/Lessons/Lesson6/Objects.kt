package Kotlin.Lessons.Lesson6

import java.util.*

fun main() {
    val  rectangle1 = Rectangle();
    println(rectangle1.perimeter(5, 6))

//    var scanner = Scanner(System.`in`)
//    val str = scanner.next()
}


class Rectangle() {
    fun perimeter(height: Int, length: Int) {
        println((height + length) * 2)
    }
}

//class Scanner() {
//    fun System() {
//        fun inK() {
//
//        }
//    }
//}