package EKIDS.Lessons.Lesson9;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(100);

        int a = 0;
        int b = 12;
        if (a == 0) {
            System.out.println("Деление на ноль запрещено!");
        } else {
            System.out.println(b / a);
        }
    }
}
