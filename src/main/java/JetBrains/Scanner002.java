package JetBrains;

import java.util.Scanner;

public class Scanner002 {
    private static final int ARRAY_OF_STRING_SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfString = new String[ARRAY_OF_STRING_SIZE];
        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfString[i] = scanner.next();
        }
        for (String element : arrayOfString) {
            System.out.println(element);
        }
    }
}
