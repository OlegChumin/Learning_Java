package lesson_10;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {-1, 3, 5, 8, 10, 15, 16, 20};
        int searchingElement = 16;
        System.out.println(binarySearchOfRandomElementInArray(sortedArray, searchingElement));
        System.out.println(binaryRecursionSearch(sortedArray, searchingElement, 0, sortedArray.length - 1));
    }

    private static int binarySearchOfRandomElementInArray(int[] array, int searchingElement) {
        int minElementIndex = 0; // индекс первого минимального элемента в отсортированном массиве
        int maxElementIndex = array.length - 1; // индекс замыкающего максимального элемента в отсортированном массиве
        // searchingElement == 18
        // [0  1  2   3   4   5   6   7   8   9] индексы
        // [3, 4, 7, 10, 11, 14, 17, 18, 22, 30] элементы
        while (minElementIndex <= maxElementIndex) {
            int middleElementIndex = minElementIndex + (maxElementIndex - minElementIndex) / 2; // индекс среднего элемента в теущм массиве
            if (searchingElement < array[middleElementIndex]) {
                maxElementIndex = middleElementIndex - 1;
            } else if (searchingElement > array[middleElementIndex]) {
                minElementIndex = middleElementIndex + 1;
            } else {
                return middleElementIndex;
            }
        }
        return -1;
    }

    private static int binaryRecursionSearch(int[] sortedArray, int searchingElement, int minIndex, int maxIndex) {
        int middleIndex = minIndex + (maxIndex - minIndex) / 2;

        if (searchingElement == sortedArray[middleIndex]) {
            return middleIndex;
        } else if (searchingElement < sortedArray[middleIndex]) {
            return binaryRecursionSearch(sortedArray, searchingElement, minIndex, middleIndex - 1);
        } else {
            return binaryRecursionSearch(sortedArray, searchingElement, middleIndex + 1, maxIndex);
        }
    }
}