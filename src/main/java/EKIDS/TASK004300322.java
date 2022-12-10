import java.util.Arrays;

public class TASK004300322 {
    public static void main(String[] args) {
        int[] array = new int[51];
        int j = 0;
        while (j < array.length) {
            array[j] = j;
            j++;
        }
        System.out.print(Arrays.toString(array));
        int a = array.length-1;
        while (a > 0) {
            System.out.print(" " + array[a]);
            a--;
        }
    }
}
