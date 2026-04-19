package lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Random;

public class LinearSearch {
    private static final Random random = new Random();
    private static final int END_RANGE_OF_RANDOM = 1_000_001;

    public static void main(String[] args) {
        int[] array = generateAndFillIntRandomArray(getLengthOfArrayToBeGenerated());
//        System.out.println(Arrays.toString(array));
        int randomElement = getRandomElementFromArray(array);
        System.out.println("randomElement = " + randomElement);
        long startTime = System.currentTimeMillis();
        int indexOfElement = linearSearchOfRandomElementInArray(array, randomElement);
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;

        System.out.println("indexOfElement = " + indexOfElement);
        System.out.println("Время поиска элемента = " + randomElement + " = " + resultTime + " индекс элемента = " + indexOfElement);
        System.out.println("Проверка, элемент из массива по индексу " + indexOfElement + " = " + array[indexOfElement]);
    }

    private static int getLengthOfArrayToBeGenerated() {
        System.out.println("Pls. enter length of array to be generated: ");
        try {
            return Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] generateAndFillIntRandomArray(int nLength) {
        int[] array = new int[nLength];
        HashSet<Integer> uniqueValues = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int randomValue = random.nextInt(END_RANGE_OF_RANDOM);
            if (!uniqueValues.contains(randomValue)) {
                array[i] = randomValue;
                uniqueValues.add(randomValue);
            }
        }
        return array;
    }

    private static int getRandomElementFromArray(int[] array) {
        int randomIndex = random.nextInt(array.length - 1);
        return array[randomIndex];
    }

    private static int linearSearchOfRandomElementInArray(int[] array, int searchingElement) {
        for (int i = 0; i < array.length; i++) {
            if (searchingElement == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
