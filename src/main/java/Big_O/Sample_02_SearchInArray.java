package Big_O;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;

public class Sample_02_SearchInArray {

    public static void main(String[] args) {
        List<Integer> arrayList = createArrayOfRandomIntegerNumbers(getArraySize());
        System.out.println(arrayList);
        System.out.println("searchMinMaxInArrayVariant_1 time work = " + mesureTimeRunOfMethod(new ArraysSearchMethods(), arrayList, Variants.ONE) + "msec");
        System.out.println("searchMinMaxInArrayVariant_2 time work = " + mesureTimeRunOfMethod(new ArraysSearchMethods(), arrayList, Variants.TWO) + "msec");
    }

    private static long mesureTimeRunOfMethod(ArraysSearchMethods arraysSearchMethods, List<Integer> list, Variants variants) {

        long timeStart = System.currentTimeMillis();
        if (variants == Variants.ONE) {
            arraysSearchMethods.searchMinMaxInArrayVariant_1(list);
        } else if (variants == Variants.TWO) {
            arraysSearchMethods.searchMinMaxInArrayVariant_2(list);
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    enum Variants {
        ONE, TWO;
    }

    static class ArraysSearchMethods {

        public PairOfMinAndMax searchMinMaxInArrayVariant_1(List<Integer> listOfIntegerNumbers) {
            PairOfMinAndMax pairOfMinAndMax = new PairOfMinAndMax();
            int min = 0;
            int max = 0;
            for (int i = 0; i < listOfIntegerNumbers.size() - 1; i++) {
                if (listOfIntegerNumbers.get(i) <= listOfIntegerNumbers.get(i + 1)) {
                    min = listOfIntegerNumbers.get(i);
                } else {
                    min = listOfIntegerNumbers.get(i + 1);
                }
                if (listOfIntegerNumbers.get(i) >= listOfIntegerNumbers.get(i + 1)) {
                    max = listOfIntegerNumbers.get(i);
                } else {
                    max = listOfIntegerNumbers.get(i + 1);
                }
            }
            pairOfMinAndMax.setMinValue(min);
            pairOfMinAndMax.setMaxValue(max);

            return pairOfMinAndMax;
        }

        public PairOfMinAndMax searchMinMaxInArrayVariant_2(List<Integer> listOfIntegerNumbers) {
            PairOfMinAndMax pairOfMinAndMax = new PairOfMinAndMax();
            int min = 0;
            int max = 0;
            for (int i = 0; i < listOfIntegerNumbers.size() - 1; i++) {
                if (listOfIntegerNumbers.get(i) <= listOfIntegerNumbers.get(i + 1)) {
                    min = listOfIntegerNumbers.get(i);
                } else {
                    min = listOfIntegerNumbers.get(i + 1);
                }
            }

            for (int i = 0; i < listOfIntegerNumbers.size() - 1; i++) {
                if (listOfIntegerNumbers.get(i) >= listOfIntegerNumbers.get(i + 1)) {
                    max = listOfIntegerNumbers.get(i);
                } else {
                    max = listOfIntegerNumbers.get(i + 1);
                }
            }
            pairOfMinAndMax.setMinValue(min);
            pairOfMinAndMax.setMaxValue(max);

            return pairOfMinAndMax;
        }
    }

    private static int getArraySize() {
        try {
            return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Integer> createArrayOfRandomIntegerNumbers(int n) {
        final Random random = new Random();
        final List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerList.add(random.nextInt(n));
        }
        return integerList;
    }

    private static class PairOfMinAndMax {
        private int maxValue;
        private int minValue;

        public int getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }

        public int getMinValue() {
            return minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        @Override
        public String toString() {
            return "PairOfMinAndMax{" +
                    "maxValue=" + maxValue +
                    ", minValue=" + minValue +
                    '}';
        }
    }
}
