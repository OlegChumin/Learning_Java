package Alishev.BaseJava;

import java.math.BigInteger;

// рекурсией называют вызов метода в теле самого метода
public class Lesson49Recursion {
    public static void main(String[] args) {
//        someMethod(3);
        System.out.println(factorial(20));
    }

    private static void someMethod(int n) {
        System.out.println("Сообщение из метода someMethod " + n);
        // ввели параметр n - количество
        if (n == 1) return;    //условие выхода из цикла рекурсии
        someMethod(n - 1);    // реурсивный вызов метода из самого себя без условия выхода приведет к StackOverflowError!
    }

    //  15! = 15*14*13*12...*1; 0! = 1;
    private static long factorial(int n) {
        long factorialN = 0;
        if (n == 1) return 1;
        return (n*factorial(n-1));
    }
}
