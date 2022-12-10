package EKIDS.Lessons.Lesson8;

public class Lesson83 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.divideInt(10, 2));
    }


}

class Calc {


    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divideInt(int a, int b) {
        return a / b;
    }
}
