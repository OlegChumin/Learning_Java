package JavaToKotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        List<Integer> arrayList = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i + 1] >= array[i]) {
                counter++;
                arrayList.add(array[i]);
            }
        }

    }
}
