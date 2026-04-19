package lessons.lesson_04;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); // считывает всю строку
        String str2 = scanner.next(); // считывает слово

        System.out.println(str);
        System.out.println(str2);


        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }
}
