package Kotlin.Lessons.Lesson4

fun main() {
    //спросить у пользователя что он хочет сделать + - / * %
    // + -- попросить ввести 2 числа (предусмотреть чтобы числа были целые
    //
//    readLine()!!.toInt()
//    sumAplusB(6, 5)
//    println(multuplyAonB(5, 5))
//    println(divideIntAonB(8, 6))
//    println(divideRestAonB(16,4))
//    println(divideFloatAonB(80.6F, 20.2F))

    sumStringAandB("Hallo", " Kotlin! ")
}

fun sumAplusB(numberA: Int, numberB: Int) {
    println(numberA + numberB)
}

fun multuplyAonB(numberA: Int, numberB: Int): Int {
    return numberA * numberB
}

fun divideIntAonB(numberA: Int, numberB: Int): Int {
    return numberA / numberB
}

fun divideRestAonB(numberA: Int, numberB: Int): Int {
    return numberA % numberB
}

fun divideFloatAonB (numberA: Float, numberB: Float): Float {
    return numberA / numberB
}

fun sumStringAandB (Str1: String, Str2: String) {
    println(Str1 + Str2)
}

