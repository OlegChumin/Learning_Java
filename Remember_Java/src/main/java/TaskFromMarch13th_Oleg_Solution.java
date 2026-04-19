import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TaskFromMarch13th_Oleg_Solution {
    /**
     * Задание, написать программу на Java или Kotlin и транслировать ее в версию C#:
     * 1. Считать данные с клавиатуры: Первое число - количество вводимых целых чисел.
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
    private static Scanner scanner = new Scanner(System.in);
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        // 1 способ чтения числа из строки
        int arraySize = getIntNumberByScanner();
        System.out.println("getIntNumberByScanner - array size: " + arraySize);
        int[] arrayOfInt = readAndFillIntArray(arraySize);
        printArray(arrayOfInt);
        printArray(sortingIntArray(arrayOfInt));
        System.out.println("min element of arrayOfInt used method getMinIntArrayElement :" + getMinIntArrayElement(arrayOfInt));
        System.out.println("max element of arrayOfInt used method  getMaxIntArrayElement" + getMaxIntArrayElement(arrayOfInt));
        getAllEvenNumbersFromIntArray(arrayOfInt);


        // 2 способ чтения числа из строки - потокобезопасный
//        System.out.println("getIntNumberByBufferedReader  - array size: " + getIntNumberByBufferedReader());

    }

    private static int getIntNumberByScanner() {
        System.out.print("Pls. enter size of the array: ");
        return scanner.nextInt();
    }

    private static int getIntNumberByBufferedReader() {
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] readAndFillIntArray(int arraySize) {
        int[] arrayOfInt = new int[arraySize];
        System.out.println("Pls. enter array element - should be Integer numbers only!");
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = scanner.nextInt();
        }
        return arrayOfInt;
    }

    private static void printArray(int[] arrayOfInt) {
        System.out.println("Current state of array: ");
        System.out.println(Arrays.toString(arrayOfInt));
        System.out.println("-------------------------");
    }

    // 8 -2 90 7 -10 -> sorting -> -10 -2 7 8 90
    private static int[] sortingIntArray(int[] arrayToSort) {
        Arrays.sort(arrayToSort);
        int[] sortedArray = arrayToSort;
        System.out.println("Sorting array...");
        return sortedArray;
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

    private static void addTwoToArrayAndPrint(int[] arrayToProcess) {
        for (int element: arrayToProcess) {
            element += 2;
        }
        System.out.println(Arrays.toString(arrayToProcess));
    }

    private static void getMaxAndMiElement(int[] arrayToSort) {
        // your code here using Arrays.sort
        Arrays.sort(arrayToSort); // double sort in case given arrayToSort is not sorted
        System.out.println("min element: " + "here should be min result value" + arrayToSort[0]);
        System.out.println("max element: " + "here should be max result value" + arrayToSort[arrayToSort.length - 1]);
    }

    private static int[] reverseArray(int[] array) {
        // your code here using to reverse all array elements
        int[] reversedArray = new int[array.length]; // создаем новый массив элементы которого
        // будут в обратном порядке от исходного
        for (int i = 0; i <= array.length / 2; i++) { // итерируемся до середины массива (если итерироваться по всему
            // массиву тоисходное состояние будет возвращено
            int temp;
            temp = array[i]; // записываем значение из ящеек с начала массива array во временную переменную
            reversedArray[i] = array[array.length - i - 1]; //записываем значения с конца массива array в начало reversedArray
            reversedArray[array.length - i - 1] = temp; // записываем значение из временной переменной в концец массива reversedArray
        }
        return reversedArray;
    }

    private static void getAllNumbersDividableOnThree(int[] arrayOfInt) {
        System.out.println("Getting all numbers % 3 == 0 from given array...");
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] % 3 == 0) {
                System.out.print(arrayOfInt[i] + " ");
            }
        }
        System.out.println();
    }
}
