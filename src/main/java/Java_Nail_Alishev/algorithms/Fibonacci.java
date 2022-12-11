package Java_Nail_Alishev.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;


public class Fibonacci {

    public static void main(String[] args) throws IOException, InterruptedException {
        int fN = inputFromKeyboard();
        long[] memriation = new long[fN + 1];

        Instant start, finish, start1, finish1;


        start1 = Instant.now();
        System.out.printf("Число Фибоначчи %d", fibNumbersFast(fN));
        //Thread.sleep(3000);
        finish1 = Instant.now();
        System.out.println("\nВремя вычисления числа Фибоначчи fibNumbersFast составило: \n" +
                Duration.between(start1, finish1).toMillis() + "мс метод Instant + Duration");

        start = Instant.now();
        System.out.printf("Число Фибоначчи %d", fibNumbers(fN));
        finish = Instant.now();
        System.out.println("\nВремя вычисления числа Фибоначчи fibNumbers составило: \n" +
                Duration.between(start, finish).toMillis() + "мс метод Instant + Duration\n");
    }

    // метод для ввода числа n, на основе которого будет вычисляться число Фибоначчи
    static int inputFromKeyboard() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = (int) Integer.parseInt(reader.readLine());
        System.out.println("Введено число N = " + N);
        return N;
    }

    // наивный, медленный, очевидный алгоритм
    private static long fibNumbers(int n) {
        if (n <= 1) return n;
        else {
            return fibNumbers(n - 1) + fibNumbers(n - 2);
            // работает тело алгоритма
        }
    }


    // метод для более быстрого вычисления числа Фиббоначи
    private static long fibNumbersFast(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

}
