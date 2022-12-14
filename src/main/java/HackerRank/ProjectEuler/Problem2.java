package HackerRank.ProjectEuler;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * <p>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class Problem2 {
    public static void main(String[] args) {
        long sum = 0;
        final long fibNumberMax = 4_000_000;
//        System.out.println(fibNumbersFast(34));
        for (int i = 2; i <= 34; i++) {
            long temp = fibNumbersFast(i);
            if (temp % 2 == 0 && sum <= fibNumberMax) {
                sum += temp;
                if (sum >= fibNumberMax) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }

    // метод для более быстрого вычисления числа Фиббоначи
    public static long fibNumbersFast(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
