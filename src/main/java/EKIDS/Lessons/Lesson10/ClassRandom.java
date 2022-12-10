package EKIDS.Lessons.Lesson10;

import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.print("\r\r" + new Random().nextInt(20));
        }
    }
}
