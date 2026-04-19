//package org.example
//
//import java.util.*
//
//object CalculateGeometryFiguresSquaresOnKotlin {
//    private val scanner = Scanner(System.`in`)
//    @JvmStatic
//    fun main(args: Array<String>) {
//        println("Программа расчета площадей геометрических фигур")
//        selectGeometryFigure()
//        println("Спасибо за использование программы.")
//    }
//
//    fun selectGeometryFigure() {
//        println(
//            "Привет, выбери номер геометрической фигуры: \n" +
//                    "1 - треугольник\n" +
//                    "2 - круг\n" +
//                    "3 - квадрат\n" +
//                    "4 - трапеция\n" +
//                    "5 - правильный многоугольник\n" +
//                    "6 - эллипс\n"
//        )
//        when (scanner.nextInt()) {
//            1 -> {
//                run {
//                    println("1 - выбран расчет площади треугольника")
//                    println("Площадь заданного треугольника = " + calculateTriangleSquare())
//                }
//            }
//
//            2 -> {
//                run {
//                    println("2 - выбран расчет площади круга")
//                    println("Площадь заданного круга = " + calculateCircleSquare())
//                }
//            }
//
//            3 -> {
//                run {
//                    println("3 - выбран расчет площади квадрата")
//                    println("Площадь заданного квадрата = " + calculateSquareSquare())
//                }
//            }
//
//            4 -> {
//                run {
//                    println("4 - выбран расчет площади трапеции")
//                    println("Площадь заданной трапеции = " + calculateTrapezoidSquare())
//                }
//            }
//
//            5 -> {
//                run {
//                    println("5 - выбран расчет площади правильного многоугольника")
//                    println("Площадь заданного правильного многоугольника = " + calculateRegularPolygon())
//                }
//            }
//
//            6 -> {
//                run {
//                    println("6 - выбран расчет площади эллипса")
//                    println("Площадь заданного эллипса = " + calculateEllipse())
//                }
//            }
//
//            else -> println("нет такой фигуры в базе программы")
//        }
//    }
//
//    //методы, которые вычисляет площадь фигуры
//    //метод, вычисляющий площадь треугольника
//    fun calculateTriangleSquare(): Double {
//        println("Просьба ввети высоту треугольника: ")
//        val height = scanner.nextDouble()
//        println("Просьба ввети сторону треугольника: ")
//        val side = scanner.nextDouble()
//        return 0.5 * height * side
//    }
//
//    //метод, вычисляющий площадь круга
//    fun calculateCircleSquare(): Double {
//        println("Введи длину радиуса окружности")
//        return Math.PI * Math.pow(scanner.nextDouble(), 2.0)
//        //Math.PI = 3, 14
//    }
//
//    //метод, вычисляющий площадь квадрата
//    fun calculateSquareSquare(): Double {
//        println("Введи длину стороны квадрата")
//        return Math.pow(scanner.nextDouble(), 2.0)
//    }
//
//    //метод, вычисляющий площадь трапеции
//    fun calculateTrapezoidSquare(): Double {
//        println("Введи длину первой параллельной стороны трапеции:")
//        val side = scanner.nextDouble()
//        println("Введи длину второй параллельной стороны трапеции:")
//        val secondSide = scanner.nextDouble()
//        println("Введи длину высоты трапеции:")
//        val height = scanner.nextDouble()
//        return 0.5 * (side + secondSide) * height
//    }
//
//    //метод, вычисляющий площадь правильного многоугольника
//    fun calculateRegularPolygon(): Double {
//        //S = n/4 × a 2 × ctg (pi/n)
//        println("Введи количество сторон правильного многоугольника:")
//        val sidesNumber = scanner.nextLong()
//        println("Введи длину стороны правильного многоугольника:")
//        val side = scanner.nextDouble()
//        return sidesNumber / 4 * Math.pow(side, 2.0) * 1 / Math.tan(Math.PI / sidesNumber)
//    }
//
//    //метод, вычисляющий площадь эллипса
//    fun calculateEllipse(): Double {
//        println("Введи длину первой полуоси эллипса")
//        val semiAxisA = scanner.nextDouble()
//        println("Введи длину второй полуоси эллипса")
//        val semiAxisB = scanner.nextDouble()
//        return Math.PI * semiAxisA * semiAxisB
//    }
//}