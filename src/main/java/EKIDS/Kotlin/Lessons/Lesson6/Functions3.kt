package Kotlin.Lessons.Lesson6

fun main() {
    println("результат деления = ${divide(8, 6)}, остаток от деления = ${divideRest(8,6)}")
}
// функция вычисляет результат целочисленного деления
fun divide(a: Int, b: Int): Int {
    return a / b
}

// функция вычисляет остаток целочисленного деления
fun divideRest(c: Int, d: Int): Int {
    return c % d
}