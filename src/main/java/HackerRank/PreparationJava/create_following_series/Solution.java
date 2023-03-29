package HackerRank.PreparationJava.create_following_series;
/**
 We have two queries:

 We use , , and  to produce some series :

 ... and so on.

 Once we hit , we print the first ten terms as a single line of space-separated integers.

 We use , , and  to produce some series :

 We then print each element of our series as a single line of space-separated values.

 */


import java.util.*;
import java.io.*;

class Solution {
    private static final class DataForSeries {
        private int a;
        private int b;
        private int n;

        public DataForSeries(int a, int b, int n) {
            this.a = a;
            this.b = b;
            this.n = n;
        }
    }

    private static final class Series {
        private int[] arrayOfSeries;

        public Series(int[] arrayOfSeries) {
            this.arrayOfSeries = arrayOfSeries;
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] argh) {
        getDataFromConsole();
        scanner.close();
    }

    private static DataForSeries[] readQSeriesOfABN(int q) {
        DataForSeries[] arrayOfSeries = new DataForSeries[q];
        for (int i = 1; i <= q; i++) {
            arrayOfSeries[i] = getDataFromConsole();
        }
        return arrayOfSeries;
    }

    private static int getQNumberOFSeries() {
        return scanner.nextInt();
    }

    private static DataForSeries getDataFromConsole() {
        return new DataForSeries(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    private static Series buildSeries() {
        Series series = new Series(new int[]);
        //TODO("some logic of method")

        return series;
    }
}
