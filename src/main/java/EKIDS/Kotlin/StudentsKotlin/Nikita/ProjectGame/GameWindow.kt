package Kotlin.StudentsKotlin.Nikita.ProjectGame

import javax.swing.JFrame
import javax.swing.WindowConstants


/**
 *
Игра Никиты
Дата: 2022г.
Версия: 01.22

Описание: В игре главный герой человек который должен собрать максимальное количество Пасхи,
Слуйчайным образом генерятся Пасхи ()
Цель игры - собрать максимальное количество Пасхи = очков
В игре будут несколько уровне по сложности (подумать)...
Специальный уровень где найти пасхальные яйца...
....

 */
class GameWindow : JFrame() {
    init {
        title = "Игра Никиты"
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        setSize(640, 665)
        setLocation(250, 250)
        //add(Paskha())
        isVisible = true
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val gameWindow = GameWindow()
        }
    }
}