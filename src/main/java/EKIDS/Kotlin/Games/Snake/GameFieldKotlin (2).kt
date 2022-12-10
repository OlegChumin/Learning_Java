package Kotlin.Games.Snake

import java.awt.Color
import java.awt.Image
import java.util.*
import javax.swing.ImageIcon
import javax.swing.JPanel
import javax.swing.Timer

class GameFieldKotlin : JPanel() {
    private val SIZE = 320
    private val DOT_SIZE = 16 //(320 x 320 --> 320/16 = 20 --> 20 x 20 = 400)
    private val ALL_DOTS = 400 // 20 x 20
    private var dot : Image? = null // поле под игровую ячейку изображения змейки
    private var apple : Image? = null // поле под игровую ячейку изображения яблока
    private var appleX = 0 // поле для хранение данных о положении яблока по оси Х
    private var appleY = 0 // поле для хранение данных о положении яблока по оси Y

    private val x = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Х
    private val y = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Y

    private var dots = 0; // размер змейки в текущий момент времени

    private val timer : Timer? = null // таймер библиотеки(класса) SWING

    // переменные отвечающие за направление движения змейки
    private val left = false
    private val right = true
    private val up = false
    private val down = false

    // переменная о статусе игры
    private val inGame = true

    init {
        background = Color.BLACK
        loadImages()
        initGame()
    }

    fun initGame() {





        createApple() // вызываем функцию
    }

    fun createApple() {  // создает случайные координаты яблока
        appleX = Random().nextInt(20) * DOT_SIZE // случаная координа яблока по Х
        appleY = Random().nextInt(20) * DOT_SIZE // случайная координата по Y
    }

    fun loadImages() { // загружает изображения яблока и тела змеи в программу
        val imageIconApple = ImageIcon("apple.png")
        apple = imageIconApple.image

        val imageIconDot = ImageIcon("dot.png")
        dot = imageIconDot.image
    }

    fun moveSnake() {

    }

/**
 && - логическрое "И"
 || - логическое "ИЛИ"
  boolean val A = true
  boolean val B = false

  A && B --> false
  B && A --> false
  B && B --> false
  A && A --> true

  A || B -- > true
  B || A --> true
  A || A --> true
  B || B --> false


 * */

    fun checkApple() {
        if (x[0] == appleX && y[0] == appleY) { //
            dots++
            createApple()
        }
    }

    fun checkBoarder() {

    }




}