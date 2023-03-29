package HackerRank.PreparationJava.create_following_series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;


class Solution {
    private static final int LOW_BOUND_Q_A_B = 0;
    private static final int UPPER_BOUND_Q = 500;
    private static final int UPPER_BOUND_A_B = 50;
    private static final int LOW_BOUND_N = 1;
    private static final int UPPER_BOUND_N = 15;


    private static final class DataForSeries {
        private int a;
        private int b;
        private int n;

        public DataForSeries(int a, int b, int n) {
            this.a = a;
            this.b = b;
            this.n = n;
        }

        @Override
        public String toString() {
            return "DataForSeries{" +
                    "a=" + a +
                    ", b=" + b +
                    ", n=" + n +
                    '}';
        }
    }

    private static final class Series {
        private List<Integer> arrayListOfSeries;

        public Series(List<Integer> arrayListOfSeries) {
            this.arrayListOfSeries = arrayListOfSeries;
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] argh) {
        int q = getQNumberOFSeries();
        DataForSeries[] dataForSeries = readQSeriesOfABN(q);
        scanner.close();
    }

    private static DataForSeries[] readQSeriesOfABN(int q) {
        DataForSeries[] arrayOfSeries = new DataForSeries[q];
        for (int i = 0; i < q; i++) {
            arrayOfSeries[i] = getDataFromConsole();
        }
        return arrayOfSeries;
    }

    private static int getQNumberOFSeries() {
        int q;
        while (true) {
            q = scanner.nextInt();
            if (q >= LOW_BOUND_Q_A_B && q <= UPPER_BOUND_Q) {
                break;
            } else System.out.println("Invalid input. Please enter values in the specified range: 0 <= q <= 500");
        }
        return q;
    }

    private static DataForSeries getDataFromConsole() {
        int a, b, n;
        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            if (LOW_BOUND_Q_A_B <= a
                    && a <= UPPER_BOUND_A_B
                    && LOW_BOUND_Q_A_B <= b
                    && b <= UPPER_BOUND_A_B
                    && LOW_BOUND_N <= n
                    && n <= UPPER_BOUND_N) {
                break;
            } else {
                System.out.println("Invalid input. Please enter values in the specified range: 0 <= a, b <= 50 and 1 <= n <= 15.");
            }
        }
        return new DataForSeries(a, b, n);
    }

    private static Series buildOneSerie(DataForSeries dataForSeries) {
        int element = 0;
        List<Integer> arrayListOfSeries = new ArrayList<>();
        for (int i = 0; i < dataForSeries.n; i++) {
            element += dataForSeries.a + (int) pow(2, (dataForSeries.n - 1)) * dataForSeries.b;
            arrayListOfSeries.add(element);
        }
        arrayListOfSeries.add(element);
        return new Series(arrayListOfSeries);
    }

    private static Series[] collectSeries(DataForSeries[] dataForSeries) {
        Series[] seriesArray = new Series[dataForSeries.length];
        for (int i = 0; i < seriesArray.length; i++) {
            seriesArray[i] = buildOneSerie(dataForSeries[i]);
        }
        return seriesArray;
    }

    private static void printSeriesToConsole(Series[] series) {
        for (int i = 0; i < series.length; i++) {
            System.out.println(series[i]);
        }
    }
}
