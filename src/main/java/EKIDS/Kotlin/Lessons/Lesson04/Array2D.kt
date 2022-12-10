package Kotlin.Lessons.Lesson04

import java.util.*

object Array2D {
    fun main() {
        val arrayOfGelb = arrayOfNulls<String>(10) // одномерный массив
        // [0][0][0][0][0][0][0][0][0][0][0][0][0]
        val array2D = Array(4) { IntArray(3) }
        println("Длина массива = " + arrayOfGelb.size)
        for (i in arrayOfGelb.indices) { //заполняем одномерный массив значениями 1
            arrayOfGelb[i] = "Привет"
        }
        for (i in arrayOfGelb.indices) {
            print(arrayOfGelb[i] + " ")
        }
        for (i in array2D.indices) {
            for (j in array2D[i].indices) {
                array2D[i][j] = 77
            }
        }
        println()
        println(Arrays.deepToString(array2D))
        for (i in array2D.indices) {
            for (j in array2D[i].indices) {
                print(array2D[i][j].toString() + " ")
            }
            println()
        }
    }
}