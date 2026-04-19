package work_with_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printArray(sortAscending(arr));
        printArray(sortDescending(arr));
        System.out.println(maxElement(arr));
        System.out.println(minElement(arr));
        printArray(negativeNumbers(arr));
        printArray(evenNumbers(arr));
        printArray(numbersDivisibleByThree(arr));
        System.out.println(sumArrayElements(arr));
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] sortAscending(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    public static int[] sortDescending(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        for (int i = 0; i < sortedArr.length / 2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[sortedArr.length - 1 - i];
            sortedArr[sortedArr.length - 1 - i] = temp;
        }
        return sortedArr;
    }

    public static int maxElement(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int minElement(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int[] negativeNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x < 0).toArray();
    }

    public static int[] evenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }

    public static int[] numbersDivisibleByThree(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 3 == 0).toArray();
    }

    public static long sumArrayElements(int[] arr) {
        return Arrays.stream(arr).asLongStream().sum();
    }
}
