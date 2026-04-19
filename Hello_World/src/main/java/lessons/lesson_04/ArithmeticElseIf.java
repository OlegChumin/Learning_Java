package lessons.lesson_04;

public class ArithmeticElseIf {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b; // 7 / 2 = 3 (целочисленное деление)
        int rest = a % b; // 7 % 2 = 1 (7 - 2 * 3 = 1) - остаток от целочисленного деления

        int even; // четное
        int odd;  // нечетное

        int number = a;
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println(("Число нечетное"));
        }

        number = b;
        if (number % 2 != 0) {
            System.out.println("Число нечетное");
        } else {
            System.out.println(("Число четное"));
        }


        //  boolean = true
        if (a > b) {
            System.out.println("a > b");
        }

        // boolean = true
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }

        if (a < 1) {
            //.....
        } else if (a == 2) {
            //....
        } else if (a == 3) {
            //....
        } else {
            //....
        }

    }
}
