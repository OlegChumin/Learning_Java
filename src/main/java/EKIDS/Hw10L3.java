import java.util.Scanner;

public class Hw10L3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int k = scan.nextInt();
        System.out.println("Введите строку");
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println("Вы сканировали число " + k);
        System.out.println("Вы ввели строку: " + str);
    }
}
