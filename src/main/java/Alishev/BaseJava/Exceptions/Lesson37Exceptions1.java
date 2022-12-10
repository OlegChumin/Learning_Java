package Alishev.BaseJava.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37Exceptions1 {
    public static void main(String[] args) throws InterruptedException {
        File newFile = new File("test.txt");

        try {
            Scanner scanner = new Scanner(newFile);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
//            e.printStackTrace();
        }
        System.out.println("Далее код выполняется");

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден в методе readFile()!");
            e.printStackTrace();
        }


        for (int i = 0; i < 5; i++) {
            System.out.print("...");
            Thread.sleep(200);
        }
        System.out.println("\nКод выполнен!");

    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner scanner1 = new Scanner(file);
    }
}
