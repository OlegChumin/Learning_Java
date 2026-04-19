package lesson_01;

public class Fibonacci {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long result = fibNaive(46);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
        System.out.println("result = " + result);

        startTime = System.currentTimeMillis();
        result = fibEffective(100);
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
        System.out.println("result = " + result);
    }

    //наивный медленный алгоритм
    private static long fibNaive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1L;
        } else {
            return fibNaive(n - 1) + fibNaive(n - 2);
        }
    }

    private static long fibEffective(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
