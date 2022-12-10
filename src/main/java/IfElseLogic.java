import java.util.Scanner;

public class IfElseLogic {
    public static void main(String[] args) {
        //  a == b,  (7 == 8), ( a < b ) ( a >= b, a <= b a > b)
        // (a >= b && a =< c) -> a - (b ... c)
        // == != &&  ||
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 != 0 && number > 25) {
            System.out.println(number + " нечетное число > 25");
        }
    }
}

