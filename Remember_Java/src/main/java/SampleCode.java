import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SampleCode {

    private static Scanner readStringLineFromConsole = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //I способ чтения с клавиатуры
        String str = readStringLineFromConsole.nextLine(); // считывает всю строку
        String str2 = readStringLineFromConsole.next(); // считывает только 1 слово до пробела
        int someNumber = readStringLineFromConsole.nextInt();
        int newNumber = Integer.parseInt(str);

        //II способ чтения с клавиатуры
        String someString = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        Double someDoubleNumber = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in))).readLine());
    }

}
