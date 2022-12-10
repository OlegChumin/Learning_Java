package EKIDS.Lessons.Lesson6;

public class Lesson63 {
    public static void main(String[] args) {
        System.out.println(Calculator.calculator(6, 7));
        System.out.println(Calculator.calculator(8, 8));
    }
}

class Calculator {
    public static int calculator(int a, int b) {
        return a * b;
    }
}