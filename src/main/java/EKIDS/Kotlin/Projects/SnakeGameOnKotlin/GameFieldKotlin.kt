package Kotlin.Projects.SnakeGameOnKotlin

import java.awt.Color
import java.awt.Graphics
import java.awt.Image
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.util.*
import javax.swing.ImageIcon
import javax.swing.JPanel
import javax.swing.Timer

class GameFieldKotlin : JPanel(), ActionListener {
    private val SIZE = 320
    private val DOT_SIZE = 16 //(320 x 320 --> 320/16 = 20 --> 20 x 20 = 400)
    private val ALL_DOTS = 400 // 20 x 20
    private var dot : Image? = null // поле под игровую ячейку изображения змейки
    private var apple : Image? = null // поле под игровую ячейку изображения яблока
    private var appleX = 0 // поле для хранение данных о положении яблока по оси Х
    private var appleY = 0 // поле для хранение данных о положении яблока по оси Y

    private val x = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Х
    private val y = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Y

    private var dots = 0 // размер змейки в текущий момент времени

    private var timer : Timer? = null // таймер библиотеки(класса) SWING

    // переменные отвечающие за направление движения змейки
    private var left = false
    private var right = true
    private var up = false
    private var down = false

    // переменная о статусе игры
    private var inGame = true

    init {
        background = Color.BLACK
        loadImages()
        initGame()
        addKeyListener(FieldKeyListener())
        isFocusable = true
    }

    fun initGame() {
        dots = 3 // нарисовали змейку
        for (i in 0 until dots) {
            x[i] = 48 - i * DOT_SIZE
            y[i] = 32
        }
        timer = Timer(400, this) // создали таймер игры и передали в actionPerformed
        timer!!.start() // запустили таймер игры
        createApple() // вызываем функцию создания яблока
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
        // опишем движение головы змейки
        if (left) {
            x[0] -= DOT_SIZE  // x[0] = x[0] - DOT_SIZE
        }

        if (right) {
            x[0] += DOT_SIZE
        }

        if (up) {
            y[0] -= DOT_SIZE
        }

        if (down) {
            y[0] += DOT_SIZE
        }

        // здесь напишем движение тела змейки за головой
        for (i in dots downTo 1) {  // координаты голвы здесь не участвуют
            x[i] = x[i - 1]  // вторая точка(кусок тела змейки, становится на след позиуциwb. и т.д.
            y[i] = y[i - 1]  // перемещаем все точки кроме головы на 1 позицию
        }

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
        for (i in dots downTo 1) { // блок проверки что змейка наткнулась на саму себя
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false
            }

            if (x[0] > SIZE ) { // правая граница
                inGame = false
            }

            if (x[0] < 0 ) { // левая граница
                inGame = false
            }

            if (y[0] < 0 ) {  // верхняя граница
                inGame = false
            }

            if (y[0] > SIZE) { // нижняя граница
                inGame = false
            }
        }

    }

    override fun actionPerformed(e: ActionEvent?) { // функция библиотеки SWING
        if (inGame) {
            checkApple()
            checkBoarder()
            moveSnake()
        }
        repaint() // перерисовак изображения на поле игры функция SWING
    }

    override fun paintComponent(graphics: Graphics) { // функция SWING
        super.paintComponent(graphics)
        if (inGame) { // нарисовали яблоко
            graphics.drawImage(apple, appleX, appleY, this)

            for (i in 1 until dots) { // нарисовали змейку
                graphics.drawImage(dot, x[i], y[i], this)
            }
        } else {
            val str = "Game Over"
            graphics.color = Color.red
            graphics.drawString(str, 125, SIZE / 2)
        }

    }

    internal inner class FieldKeyListener : KeyAdapter() { // создали класс для отслеживания нажатий клавиш
        override fun keyPressed(e: KeyEvent) {
            super.keyPressed(e)
            val key = e.keyCode
            if (key == KeyEvent.VK_LEFT && !right) {
                left = true
                up = false
                down = false
            }

            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true
                up = false
                down = false
            }

            if (key == KeyEvent.VK_UP && !down) {
                right = false
                up = true
                left = false
            }

            if (key == KeyEvent.VK_DOWN && !up) {
                right = false
                down = true
                left = false
            }

        }
    }
}