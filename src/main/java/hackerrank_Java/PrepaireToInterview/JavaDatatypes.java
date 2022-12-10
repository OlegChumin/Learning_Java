package hackerrank_Java.PrepaireToInterview;

import java.util.Scanner;


public class JavaDatatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();                   // reading integer T denoting the number of test cases
        String[] arrayOfNumbers = new String[T];


        for (int i = 0; i < T; i++) {                   // reading Input data and store it in String arrayOfNumbers
            arrayOfNumbers[i] = sc.nextLine();
        }

        for (int i = 0; i < T; i++) {
            try {
                long x = Long.parseLong(arrayOfNumbers[i]);
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
