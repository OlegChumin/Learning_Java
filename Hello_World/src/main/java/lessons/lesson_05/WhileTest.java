package lessons.lesson_05;

public class WhileTest {
    public static void main(String[] args) {

        int count = 0;

        while (true) {
            count = count + 1;
            if (count > 10) {
                break;
            }
            System.out.println("Hallo world! count = " + count);
        }

        count = 0;

        do {
            count = count + 1;
            if (count > 10) {
                break;
            }
            System.out.println("Hallo world! count = " + count);
        } while (true);
    }
}
