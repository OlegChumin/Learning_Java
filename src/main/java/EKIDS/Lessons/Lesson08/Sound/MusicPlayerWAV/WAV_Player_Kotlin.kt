package Java.Lessons.Lesson08.Sound.MusicPlayerWAV

import java.io.File
import java.io.IOException
import java.util.*
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.LineUnavailableException
import javax.sound.sampled.UnsupportedAudioFileException

object WAV_Player_Kotlin {
    @Throws(UnsupportedAudioFileException::class, IOException::class, LineUnavailableException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val file =
            File("C:\\Users\\Oleg_Chumin\\IdeaProjects\\EKIDS\\src\\Java\\MusicPlayerWAV\\09 Money for Nothing.wav")
        val audioInputStream = AudioSystem.getAudioInputStream(file)
        val clip = AudioSystem.getClip()
        clip.open(audioInputStream)
        var response = ""
        val scanner = Scanner(System.`in`)

        // P - play, S - Stop, R - reset, Q - quit
        while (response != "Q") {
            println("P - play, S - Stop, R - reset, Q - quit")
            println("Enter your choice: ")
            response = scanner.next()
            response = response.uppercase(Locale.getDefault())
            when (response) {
                "P" -> clip.start()
                "S" -> clip.stop()
                "R" -> clip.microsecondPosition = 0
                "Q" -> {}
                else -> println("Not a valid response!")
            }
        }
        println("Byyeeee!")
    }
}