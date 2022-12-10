package Kotlin.StudentsKotlin.Gleb.ProjectGame

import Kotlin.StudentsKotlin.Nikita.ProjectGame.GameWindow
import javax.swing.JFrame
import javax.swing.WindowConstants

class UnknownPlanet : JFrame() {
    init {
        title = "Неизведанная планета"
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        setSize(640, 665) // разрешение экрана
        setLocation(250, 250)
        //add(Paskha())
        isVisible = true
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val unknownPlanet = UnknownPlanet()
        }
    }
}
