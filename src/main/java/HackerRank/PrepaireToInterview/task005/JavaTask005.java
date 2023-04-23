package HackerRank.PrepaireToInterview.task005;


import java.util.Scanner;

public class JavaTask005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        int int1 = scanner.nextInt();
        String str2 = scanner.next();
        int int2 = scanner.nextInt();
        String str3 = scanner.next();
        int int3 = scanner.nextInt();


        System.out.println("================================");
        System.out.printf("%-15s%03d%n", str1, int1);  //отступ от начала строки на 15 символов + 3 pads под цифру
        System.out.printf("%-15s%03d%n", str2, int2);
        System.out.printf("%-15s%03d%n", str3, int3);
        System.out.println("================================");

    }
}
