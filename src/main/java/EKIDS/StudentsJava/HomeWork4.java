package EKIDS.StudentsJava;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] array = new int[51];
        int j = 0;
        while (j < array.length) {
            array[j] = j;
            j++;
        }
        System.out.println(Arrays.toString(array));

        int k = array.length-1;
        while (k > 0) {
            System.out.print(" " + array[k]);
            k--;
        }
    }
}