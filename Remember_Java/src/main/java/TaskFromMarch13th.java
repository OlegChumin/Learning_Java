import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TaskFromMarch13th {
    /**
     * Задание, написать программу на Java или Kotlin и транслировать ее в версию C#:
     * 1. Считать данные с клавиатуры: Первое число - количество вводимых целых чисел (длина массива).
     * Второе число - набор данных, массив любых целых чисел int[] array =  new array[первое число].
     * 2. Создать новый массив из исходного с сортировкой чисел. Вывести его на экран.
     * 3. Найти максимальны и минимальный элементы массива и вывести их на экран.
     * 4. Вывести сортированный массив в обратном порядке.
     * 5. Добавить к каждому элементу массива 2 и вывести на экран.
     * 6. Найти среди элементов массива четные числа. Вывести их на экран или вывести "нет целых чисел"
     * 7. Найти среди элементов массива числа, нацело делящиеся на 3, вывести их на экран, или вывести "нет чисел, делящихся на 3"
     * <p>
     * Требования: оформить программу в виде методов/функций.
     * Вывод на экран также оформить как отдельный метод/функцию.
     */
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    private final static int ADDED_ELEMENT = 2;

    public static void main(String[] args) {
        // 1 способ чтения числа из строки
        int arraySize = getIntNumberByScanner();

        int[] arrayOfInt = readAndFillIntArray(arraySize);
        printArray(arrayOfInt);
        printArray(sortingIntArray(arrayOfInt));
        printArray(reverseArray(arrayOfInt));
        getMaxAndMinElement(arrayOfInt);
        addTwoToEachArrayElementAndPrint(arrayOfInt);
        System.out.println("min element of arrayOfInt used method getMinIntArrayElement: " + getMinIntArrayElement(arrayOfInt));
        System.out.println("max element of arrayOfInt used method  getMaxIntArrayElement: " + getMaxIntArrayElement(arrayOfInt));
        getAllEvenNumbersFromIntArray(arrayOfInt);
        getAllNumbersDividableOnThree(arrayOfInt);

        // 2 способ чтения числа из строки - потокобезопасный
//        System.out.println("getIntNumberByBufferedReader  - array size: " + getIntNumberByBufferedReader());

    }

    private static int getIntNumberByScanner() {
        System.out.print("Pls. enter size of the array: ");
        int arraySize = SCANNER.nextInt();;
        System.out.println("getIntNumberByScanner - array size: " + arraySize);
        return arraySize;
    }

    private static int getIntNumberByBufferedReader() {
        try {
            return Integer.parseInt(BUFFERED_READER.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] readAndFillIntArray(int arraySize) {
        int[] arrayOfInt = new int[arraySize];
        System.out.println("Pls. enter array element - should be Integer numbers only!");
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = SCANNER.nextInt();
        }
        return arrayOfInt;
    }

    private static void printArray(int[] arrayOfInt) {
        System.out.println("Current state of array: ");
        System.out.println(Arrays.toString(arrayOfInt));
        System.out.println("-------------------------");
    }

    // 8 -2 90 7 -10 -> sorting -> -10 -2 7 8 90
    private static int[] sortingIntArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorting array...");
        return array;
    }

    private static int getMinIntArrayElement(int[] arrayOfInt) {
        int minElement = Integer.MAX_VALUE;
        System.out.println("Getting min element of given array...");
        for (int element : arrayOfInt) {
            if (element <= minElement) {
                minElement = element;
            } // -> arrayOfInt[i]
        }
        return minElement;
    }

    private static int getMaxIntArrayElement(int[] arrayOfInt) {
        int maxElement = Integer.MIN_VALUE;
        System.out.println("Getting max element of given array...");
        for (int element : arrayOfInt) {
            if (element >= maxElement) {
                maxElement = element;
            } // -> arrayOfInt[i]
        }
        return maxElement;
    }

    private static void getAllEvenNumbersFromIntArray(int[] arrayOfInt) {
        System.out.println("Getting all even numbers (... % 2 == 0) from given array...");
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] % 2 == 0) {
                System.out.print(arrayOfInt[i] + " ");
            }
        }
        System.out.println();
    }


    private static void getMaxAndMinElement(int[] array) {
        // your code here using Arrays.sort
        Arrays.sort(array); // double sort in order to be sure that array is sorted
        System.out.println("min element from given array is: " + array[0]);
        System.out.println("max element from given array is: " + array[array.length - 1]);
    }

    private static int[] reverseArray(int[] array) {
        // your code here using to reverse all array elements
        int[] reversedArray = new int[array.length];
        // 0   1   2  3  4             0   1  2  3  4                      0   1 2 3 4 5
        //[4][-2][12][3][7] -> sorted [-2][3][4][7][12] -> reversed array [12][7][4][3][-2]
        for (int i = 0; i <= array.length / 2; i++) { // array[x][][][][][y] -> reversedArray [y][][][][][x]
            int temp;
            temp = array[i];
            reversedArray[i] = array[array.length - 1 - i];
            reversedArray[reversedArray.length - 1 - i] = temp;
        }
        return reversedArray;
    }

    private static void addTwoToEachArrayElementAndPrint(int[] arrayToProcess) {
        for (int element : arrayToProcess) {
            element += ADDED_ELEMENT;
        }
        System.out.println("Add 2 to all given array elements: " + Arrays.toString(arrayToProcess));
    }

    private static void getAllNumbersDividableOnThree(int[] arrayOfInt) {
        System.out.println("Getting all even numbers % 3 == 0) from given array...");
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] % 3 == 0) {
                System.out.print(arrayOfInt[i] + " ");
            }
        }
        System.out.println();
    }
}
