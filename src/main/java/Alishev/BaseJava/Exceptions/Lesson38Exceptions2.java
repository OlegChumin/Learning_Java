package Alishev.BaseJava.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Lesson38Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("Ошибка ввода! Введено что-то, кроме 0!");
            }
        }
    }
}

