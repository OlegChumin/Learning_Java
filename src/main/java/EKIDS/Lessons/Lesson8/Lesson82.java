package EKIDS.Lessons.Lesson8;
/**
 * Имя цвета	Цветовой код	Цвет фона	        Код цвета фона
 * ЧЕРНЫЙ	    \u001B[30m	    BLACK_BACKGROUND	\u001B[40m
 * КРАСНЫЙ	    \u001B[31m	    RED_BACKGROUND	    \u001B[41m
 * Зеленый	    \u001B[32m	    GREEN_BACKGROUND	\u001B[42m
 * Желтый	    \u001B[33m	    YELLOW_BACKGROUND	\u001B[43m
 * Синий	    \u001B[34m	    BLUE_BACKGROUND	    \u001B[44m
 * Фиолетовый	\u001B[35m	    PURPLE_BACKGROUND	\u001B[45m
 * голубой	    \u001B[36m	    CYAN_BACKGROUND	    \u001B[46m
 * БЕЛЫЙ	    \u001B[37m	    WHITE_BACKGROUND	\u001B[47m
 */


public class Lesson82 {
    public static void main(String[] args) throws InterruptedException {
        String ANSI_YELLOW = "\u001B[34m";
        String ANSI_RESET = "\u001B[0m";
//        String BACKGROUND = "\u001B[34m";
//        String BACKGROUND_RESET = "\u001B[40m";

        System.out.println(ANSI_YELLOW + "Hallo Java" + ANSI_RESET);
        System.out.print("\\\'Privet\\\'");
        Thread.sleep(1500);
        System.out.println("\r\r\r\r\r\rPoka");
        System.out.println(9 + "\r" + 8);
    }
}
