package Kotlin.Lessons.Lesson6

fun main() {
    println(multiply(multiply2(2, 2), multiply2(2, multiply(2, 2))))
}


fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun multiply2(c: Int, d: Int): Int {
    return c * d
}