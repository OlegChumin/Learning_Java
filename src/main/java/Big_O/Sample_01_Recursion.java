package Big_O;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample_01_Recursion {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("sumOfSequence of number n = " + n + " is " + sumOfSequence(n));
        System.out.println("sumOfPairNumbers of number n = " + n + " is " + sumOfPairNumbers(n));
    }

    //recursion function
    private static int sumOfSequence(int n) { // if n == 3 then 3 times, if n == 10 then 10 time -> O(N) speed
        if (n == 1) {
            return 1;
        } else return n + sumOfSequence(n - 1);
    }

    private static int sumOfPairNumbers(int n) { // O(N) line function
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    private static int pairSum(int x, int y) { // O(1)
        return x + y;
    }
}
