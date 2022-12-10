package Kotlin

import java.awt.Color
import java.awt.Image
import javax.swing.JPanel
import javax.swing.ImageIcon
import javax.swing.Timer

/**
 * * JPanel — это элемент управления, представляющий собой прямоугольное пространство,
 * * на котором можно размещать другие  * элементы. Элементы добавляются и удаляются
 * * методами, унаследованными от класса Container. */
class GameField : JPanel() {
    private val SIZE = 320 // задали размер нашего экрана
    private val DOT_SIZE = 16 // размер яблока и секции змейки
    private val ALL_DOTS = 400 // количество игровых элементов
    private var dot // поле под игровую ячейку изображения змейки
            : Image? = null
    private var apple // поле под игровую ячейку изображения яблока
            : Image? = null
    private val appleX // поле для хранение данных о положэении яблока по оси Х
            = 0
    private val appleY // поле для хранение данных о положэении яблока по оси Y
            = 0
    private val x = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Х
    private val y = IntArray(ALL_DOTS) // храним данные в массиве о положении змейки на поле по оси Y
    private val dots // размер змейки в текущий момент времени
            = 0
    private val timer // таймер библиотеки(класса) SWING
            : Timer? = null
    private val left = false // переменная отвечает за направление движения змейки
    private val right = true // переменная отвечает за направление движения змейки
    private val up = false // переменная отвечает за направление движения змейки
    private val down = false // переменная отвечает за направление движения змейки
    private val inGame = true // переменная отвечающая за информацию в игре мы или уже нет

    init {
        background = Color.black
        loadImages()
    }

    fun loadImages() {
        val iia = ImageIcon("apple.png") // загрузка изображения яблока в среду программы
        apple = iia.image
        val iid = ImageIcon("dot.png") // загрузка изображения змейки в среду программы
        dot = iid.image
    }
}