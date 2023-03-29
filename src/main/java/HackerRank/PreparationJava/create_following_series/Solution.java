package HackerRank.PreparationJava.create_following_series;

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

    private static buildSeries
}
