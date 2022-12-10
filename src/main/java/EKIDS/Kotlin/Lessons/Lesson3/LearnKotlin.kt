package Kotlin.Lessons.Lesson3

fun main() {
    val test1: String = "Hello" //неизменяемое значение константа
    var test2: String = "Hello"
    test2 = "GoodBye"

//    val test3 = readLine()
//    val test4 = readLine()!!.toInt()

    println("Value of test1 $test1")
    println("Sum is ${2 + 2}")

    //циклы
    val items = listOf("apple", "banana", "orange") //List.of() Java 9
    mutableListOf("apple", "banana", "orange") //ArrayList Java

    //for each
    for(item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //диапазоны
    println(10 in 3..10) //true

    for (i in 1..10)
        print("$i ")

    for (i in 1 until 10)
        println(i)


    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10)
        println(i)

    val name = "Madrigal"
    var healthPoints = 100
    if (healthPoints == 100) {
        println(name + " is in excellent condition!")
    } else if (healthPoints >= 90) {
        println(name + " has a few scratches.")
    } else if (healthPoints >= 75) {
        println(name + " has some minor wounds.")
    } else if (healthPoints >= 15) {
        println(name + " looks pretty hurt.")
    } else {
        println(name + " is in awful condition!")
    }


}