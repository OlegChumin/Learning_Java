package materials.lesson_02_05.if_else;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println(result);
    }
}
