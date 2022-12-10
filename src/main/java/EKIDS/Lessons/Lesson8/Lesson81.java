package EKIDS.Lessons.Lesson8;

import java.util.Scanner;

public class Lesson81 {
    public static void main(String[] args) {
//        System.out.println(8 % 6);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Число " + x + " четное ");
        } else System.out.println("Число " + x + " не четное ");

    }
}
