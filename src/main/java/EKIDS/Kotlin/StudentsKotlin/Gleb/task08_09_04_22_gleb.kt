package Kotlin.StudentsKotlin.Gleb

fun main() {

    /**
     * Имя цвета	Цветовой код	Цвет фона	Код цвета фона
     * ЧЕРНЫЙ	    \u001B[30m	    BLACK_BACKGROUND	\u001B[40m
     * КРАСНЫЙ	    \u001B[31m	    RED_BACKGROUND	    \u001B[41m
     * Зеленый	    \u001B[32m	    GREEN_BACKGROUND	\u001B[42m
     * Желтый	    \u001B[33m	    YELLOW_BACKGROUND	\u001B[43m
     * Синий	    \u001B[34m	    BLUE_BACKGROUND	    \u001B[44m
     * Фиолетовый	\u001B[35m	    PURPLE_BACKGROUND	\u001B[45m
     * голубой	    \u001B[36m	    CYAN_BACKGROUND	    \u001B[46m
     * БЕЛЫЙ	    \	    WHITE_BACKGROUND	\u001B[47m
     */


    val ANSI_YELLOW = "\u001B[33m"
    val ANSI_red = " \u001B[31m"
    val ANSI_blue = "\u001B[34m"
    val ANSI_green = "   \u001B[32m"
    val ANSI_purple = "\u001B[35m"
    val ANSI_RESET = "\u001B[37m"

    Thread.sleep(500)
    println(
        ANSI_red + "Плим. ПЛИМ. Ложка — это ложка, Ложкой суп \n" +
                ANSI_YELLOW + " едят. Кошка — это кошка, У кошки семь котят.\n" +
                ANSI_blue + " Тряпка — это тряпка, Тряпкой вытру пол. Шапка — это шапка,\n" +
                ANSI_green + " Оделся и пошел. А я придумал слово, Смешное слово — плим. Я \n" +
                ANSI_purple + "повторяю снова: Плим, плим, плим! Все прыгает и скачет - Плим, плим, плим!\n" +
                " И ничего не значит - Плим, плим, плим\n"
    )

}