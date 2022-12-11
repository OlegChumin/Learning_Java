package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_02;

import java.util.Scanner;

public class ExceptionSample_09 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("User entered something wrong!");
            }
        }
    }
}
