package Kotlin.Lessons.Lesson5

fun main() {
    val rectangle1 = Rectangle();
    rectangle1.perimeter(8, 10)
}


open class Rectangle() {
    fun perimeter(height: Int, length: Int) {
        println(height * length * 2)
    }
}
