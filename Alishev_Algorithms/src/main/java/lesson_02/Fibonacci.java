package lesson_02;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1); // -1 маркер == fibNaiv() с текущим n не был еще вызван
        System.out.println(fibNaive(n, mem));
    }

    // Наивный медленный алгоритм для вычисления числа Фибоначчи с использованием мемоизации
    private static long fibNaive(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n]; // Возвращаем результат, если он уже был вычислен ранее и записан в mem[n]
        }
        if (n <= 1) { // Возвращаем n, если n меньше или равно 1, так как для n = 0 и n = 1 значение Фибоначчи равно самому числу
            return n;
        }
        // Вычисляем число Фибоначчи для n-1 и n-2, если они еще не вычислены
        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        // Сохраняем результат в mem[n], чтобы не вычислять его повторно при следующих вызовах
        mem[n] = result;
        return result; // Возвращаем результат
    }
}
