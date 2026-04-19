package lessons.lesson_05;

public class ColorText {
    private static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";



    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Этот текст будет красным" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Этот текст будет зеленый" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Этот текст будет синий" + ANSI_RESET);
        System.out.println(ANSI_WHITE + "Этот текст будет белый" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Этот текст будет желтый" + ANSI_RESET);

    }
}
