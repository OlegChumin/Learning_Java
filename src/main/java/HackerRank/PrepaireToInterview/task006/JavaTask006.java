package HackerRank.PrepaireToInterview.task006;

import java.util.Scanner;

public class JavaTask006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creat Scanner variable scanner to get data from console
        int q = scanner.nextInt(); //read number of sequences in variable q
        for (int i = 0; i < q; i++) { //reading a, b, n parameters of q sequences
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int tepmporary = a + 1 * b;
            for (int j = 0; j < n; j++) {
                System.out.print(tepmporary + " ");
                tepmporary = tepmporary + (int) Math.pow(2, j + 1) * b;
            }
            System.out.println();
        }
        scanner.close();
    }
}
