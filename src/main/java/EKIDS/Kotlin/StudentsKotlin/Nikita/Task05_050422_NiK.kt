package Homework3

import java.util.Scanner

class Task05_050422_NiK {
}
fun main() {
    print("Введите уровень здоровья от 0 до 100: ")
    var scanner = Scanner(System.`in`)
    var healthPoint = scanner.nextInt()
    val name = "Tank1"
    if (healthPoint == 100) {
        println("$name уровень брони 100%")
    } else if (healthPoint == 90) {
        println("$name уровень брони 90%")
    } else if (healthPoint == 80) {
        println("$name уровень брони 80%")
    }
    else if (healthPoint == 70) {
        println("$name уровень брони 70%")
    }
    else if (healthPoint == 60) {
        println("$name уровень брони 60%")
    }
    else if (healthPoint == 50) {
        println("$name уровень брони 50%")
    }
    else if (healthPoint == 40) {
        println("$name уровень брони 40%")
    }
    else if (healthPoint == 30) {
        println("$name уровень брони 30%")
    }
    else if (healthPoint == 20) {
        println("$name уровень брони 20%")
    }
    else if (healthPoint == 10) {
        println("$name уровень брони 10%")
    }
    else if (healthPoint == 0) {
        println("$name уничтожен")
    }
    else {println("введено недоступное число")
}}