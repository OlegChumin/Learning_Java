package Kotlin.Lessons.Lesson4

fun main() {
    print(divideDoubleAB(9.0, 6.0))
}

fun sumAB(a: Int, b: Int)  {
    println(a + b)
}

fun sumABResult(a: Int, b: Int): Int  {
    return a + b
}

fun sumAB(a1: Int, b1: Int, c1: Int ): Int = a1 + b1 + c1

fun multiplyAB(a: Int, b: Int) : Int {
    return a * b
}

fun divideAB(a: Int, b: Int): Int {
    return a / b
}

fun divideDoubleAB(a: Double, b: Double): Double {
    return a / b
}

fun stringSumAB(str1: String, str2: String) : String {
    return str1 + str2
}