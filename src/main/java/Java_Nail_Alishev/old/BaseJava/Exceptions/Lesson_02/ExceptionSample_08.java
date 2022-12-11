package Java_Nail_Alishev.old.BaseJava.Exceptions.Lesson_02;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionSample_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("User enter number instead of zero!");;
                }
            }
        }
    }
}
