package EKIDS.StudentsJava.Mark;

import java.util.Scanner;

public class Task02_040422_Mark {
    public static void main(String[] args) {
        String[] stringArray = new String[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиде семь кличек домашних животных (после каждой клички нажмите Enter!)");
        stringArray[0] = scanner.nextLine();
        stringArray[1] = scanner.nextLine();
        stringArray[2] = scanner.nextLine();
        stringArray[3] = scanner.nextLine();
        stringArray[4] = scanner.nextLine();
        stringArray[5] = scanner.nextLine();
        stringArray[6] = scanner.nextLine();
        for (String clichka: stringArray) {
            System.out.println("Кличка - " + clichka);
        }
    }
}
