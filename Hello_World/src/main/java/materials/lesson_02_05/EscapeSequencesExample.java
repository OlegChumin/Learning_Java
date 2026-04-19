package materials.lesson_02_05;
/**
 * Эти управляющие литералы позволяют вам включать специальные символы в строки в Java, которые в противном случае
 * могли бы создавать трудности из-за своего значения или специфического использования в языке программирования.
 * */

public class EscapeSequencesExample {
    public static void main(String[] args) {
        System.out.println("Привет,\\nмир!");
        System.out.println("Имя:\\tJohn");
        System.out.println("Программирование\\b языка Java");
        System.out.println("Hello\\rWorld");
        System.out.println("Это \\\"строка\\\" с кавычками.");
        System.out.println("Это символ: \\\'");
        System.out.println("Это обратная косая черта: \\\\");
    }
}
