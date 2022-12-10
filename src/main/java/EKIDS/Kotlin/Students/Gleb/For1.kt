package Kotlin.Students.Gleb

object For1 {
    @JvmStatic
    fun main(args: Array<String>) {
        var i = 1
        while (i < 100) {
            print("$i, ")
            i += 5
        }
    }
}