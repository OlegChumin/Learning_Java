package hackerrank_Java.PrepaireToInterview;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); //read the first line contains an integer, q, denoting the number of queries.
        for (int i = 0; i < q; i++) {
            int a = in.nextInt(); // reading a
            int b = in.nextInt(); // reading b
            int n = in.nextInt(); // reading n (power index)
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.printf("%s ", sum);
            }
            System.out.println();
        }
        in.close();
    }
}
