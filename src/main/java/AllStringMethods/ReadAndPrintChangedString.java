package AllStringMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndPrintChangedString {
    private final static int CHAR_AT = 0;

    public static void main(String[] args) {
        String stringToCheck = readString();
        switch (stringToCheck.charAt(0)) {
            case 'i': {
                int result = Integer.parseInt((new StringBuilder(stringToCheck)).deleteCharAt(CHAR_AT).toString()) + 1;
                System.out.println(result);
                break;
            }
            case 's': {
                System.out.println((new StringBuilder(stringToCheck)).deleteCharAt(CHAR_AT).reverse());
                break;
            }
            default:
                System.out.println(stringToCheck);
                break;
        }
    }

    private static String readString() {
        try {
            return (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
