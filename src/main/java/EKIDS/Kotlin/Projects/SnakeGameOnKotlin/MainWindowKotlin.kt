package Kotlin.Projects.SnakeGameOnKotlin


import javax.swing.JFrame
import javax.swing.WindowConstants

// awt JDK((JRE)JVM)
// SWING
// JAVA FX

class MainWindowKotlin : JFrame() {
    init {
        title = "Змейка"
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        setSize(320, 345)
        setLocation(400, 400)
        add(GameFieldKotlin())
        isVisible = true;
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mainWindow = MainWindowKotlin()
        }
    }

}
