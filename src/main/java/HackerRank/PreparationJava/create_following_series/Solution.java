package HackerRank.PreparationJava.create_following_series;

import java.util.*;
import java.io.*;

class Solution {
    private static final class DataSeries {
        private int a;
        private int b;
        private int n;

        public DataSeries(int a, int b, int n) {
            this.a = a;
            this.b = b;
            this.n = n;
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] argh) {
        getDataFromConsole();
        scanner.close();
    }

    private static DataSeries[] readQSeriesOfABN(int q) {
        DataSeries[] arrayOfSeries = new DataSeries[q];
        for (int i = 1; i <= q; i++) {

        }
        return arrayOfSeries;
    }

    private static int getQNumberOFSeries() {
        return scanner.nextInt();
    }

    private static DataSeries getDataFromConsole() {
        return new DataSeries(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
