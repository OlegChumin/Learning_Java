package Kotlin

import java.awt.Color
import java.awt.Graphics
import java.awt.Image
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.util.*
import javax.swing.ImageIcon
import javax.swing.JPanel
import javax.swing.Timer

/**
 * * JPanel — это элемент управления, представляющий собой прямоугольное пространство,
 * * на котором можно размещать другие  * элементы. Элементы добавляются и удаляются
 * * методами, унаследованными от класса Container.
 */
class GameFieldKotlin : JPanel(), ActionListener {
    private val SIZE = 320 // задали размер нашего экрана
    private val DOT_SIZE = 16 // размер яблока и секции змейки
    private val ALL_DOTS = 400 // количество игровых элементов
    private var dot // поле под игровую ячейку изображения змейки
            : Image? = null
    private var apple // поле под игровую ячейку изображения яблока
            : Image? = null
    private var appleX // поле для хранение данных о положэении яблока по оси Х
            = 0
    private var appleY // поле для хранение данных о положэении яблока по оси Y
            = 0
    private val x = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Х
    private val y = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Y
    private var dots // размер змейки в текущий момент времени
            = 0
    private var timer // таймер библиотеки(класса) SWING
            : Timer? = null
    private val left = false // переменная отвечает за направление движения змейки
    private val right = true // переменная отвечает за направление движения змейки
    private val up = false // переменная отвечает за направление движения змейки
    private val down = false // переменная отвечает за направление движения змейки
    private var inGame = true // переменная отвечающая за информацию в игре мы или уже нет

    init {
        background = Color.black
        loadImages()
        initGame()
    }

    // метод который инициализирует начало игры
    fun initGame() {
        dots = 3 // начальное количество точек
        for (i in 0 until dots) {
            x[i] = 48 - i * DOT_SIZE // 48 кратно 16, остальные при движенни справа
            y[i] = 48 // таким образом положили звейку вдоль оси х
            // ось х от 0 до 320, ось н от 0 до 320 но н задан 345 поскольку
            // в MAC верхнее поле мю это еще 25 пикселей
            timer = Timer(400, this)
            timer!!.start()
            createApple()
        }
    }

    fun createApple() {
        appleX = Random().nextInt(20) * DOT_SIZE // 20 x 16 пиксельных квадратиков
        // можем поместиться на поле по осям
        appleY = Random().nextInt(20) * DOT_SIZE
    }

    fun loadImages() {
        val iia = ImageIcon("apple.png") // загрузка изображения яблока в среду программы
        apple = iia.image
        val iid = ImageIcon("dot.png") // загрузка изображения змейки в среду программы
        dot = iid.image
    }

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g) // перерисовка всего
        if (inGame) {
            g.drawImage(apple, appleX, appleY, this)
            for (i in 0 until dots) {
                g.drawImage(dot, x[i], y[i], this)
            }
        }
    }

    // перерисовывает змейку согласно массиву положений
    fun moveSnake() {
        for (i in dots downTo 1) {
            x[i] = x[i - 1] // вторая точка становится на 3-ю и т.д.
            y[i] = y[i - 1] // переместили все точки кроме головы на одну позицию
        }
        // опишем движение головы змейки
        if (left) {
            x[0] -= DOT_SIZE
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
    }

    // столкновение с яблоком
    fun checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++ // увеличиваем змейку
            createApple() // создаем новое яблоко
        }
    }

    // столкновение с границами
    fun checkBorder() {
        for (i in dots downTo 1) {
            if (i > 4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false
            }
            if (x[0] > SIZE) {
                inGame = false
            }
            if (x[0] < 0) {
                inGame = false
            }
            if (y[0] > SIZE) {
                inGame = false
            }
            if (y[0] < 0) {
                inGame = false
            }
        }
    }

    // ввиду имплементации интерфейса ActionListener переопределяем метод
    // actionPerformed который будет выполнятся кадлые 250мс согласно становленному выше таймеру
    override fun actionPerformed(e: ActionEvent) {
        if (inGame) {  // проверка если в игре идет проверка на столкновение с границами и яблоком
            // и перерисовываем поле
            checkApple()
            checkBorder()
            moveSnake()
        }
        repaint() // метод отрисовывает все компоненты paint component
    }
}