package Kotlin.Lessons.Lesson3

fun main() {
    val test1 = "Hello"
    val test0: String = "Hello"
    var test2: String = "Hello"
    test2 = "GoodBye"

    println("Value of text1 $test1")
    println("Sum is ${2 + 5}")

    //циклы               0        1          n (items.size-1)         ....
    val items = listOf("apple", "banana", "orange")
    mutableListOf("apple", "banana", "orange")
    println(items.size) //3

    //for each
    for(item in items)
        print("$item ")

    println()

    var index = 0
    while (index < items.size) {
        println("Элемент по номером $index есть ${items[index]}")
        index++  //index = index + 1
    }

    for (i in 1..10)
        print("$i ")

    for (i in 1 until 10)
        print("$i ")

    for (i in 10 downTo 1)
        print("$i ")

    for (i in 0..100 step 5)
        print("$i ")

    for (i in 100..0 step 10)
        print("$i ")

            //здоровье нашего героя
    val name = "Tank1"
    var healthPoint = 80

    if (healthPoint == 100) {
        println("$name уровень брони 100%")
    } else if (healthPoint == 90) {
        println("$name уровень брони 90%")
    } else if (healthPoint == 80) {
        println("$name уровень брони 80%")
    }
}

