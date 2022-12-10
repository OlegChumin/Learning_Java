package Alishev.BaseJava.Exceptions.Lesson_02;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionSample_07 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) {
                throw new IOException();
            }
        }
    }
}
