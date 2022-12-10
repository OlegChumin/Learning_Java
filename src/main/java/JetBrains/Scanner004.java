package JetBrains;

import java.util.Scanner;

public class Scanner004 {
    private static final int ARRAY_OF_STRING_SIZE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfString = new String[ARRAY_OF_STRING_SIZE];
        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfString[i] = scanner.next();
        }
        for (int i = arrayOfString.length - 1; i >= 0; i--) {
            System.out.println(arrayOfString[i]);
        }
    }
}
