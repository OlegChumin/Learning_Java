package Kotlin.Lessons.Lesson05

fun main() {
    multiply(2, multiply2(2, 3))
}


fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun multiply2(c: Int, d: Int): Int {
    return c * d
}