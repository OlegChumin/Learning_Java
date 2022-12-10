import java.util.Scanner;

public class BusTour {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int busHeight = Integer.parseInt(scanner.next());
        int numberOfBridges = Integer.parseInt(scanner.next());
        int[] bridgesHeights = new int[numberOfBridges];
        bridgesHeights = fillArray(bridgesHeights);
    }

//    public static int[] readData(String str){
//
//        return ;
//    }

    public static int[] fillArray(int[] array) {
        if (array.length == 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }
}
