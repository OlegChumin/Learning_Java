package AllStringMethods

const val N_FIRST_SYMBOLS = 1
fun main() {
    val input = readln()
    when {
        input.isNotEmpty() && input.lowercase().first() == 'i' -> println("${input.drop(N_FIRST_SYMBOLS).toInt() + 1}")
        input.isNotEmpty() && input.lowercase().first() == 's' -> println("${input.drop(N_FIRST_SYMBOLS).reversed()}")
        else -> println(input)
    }
}