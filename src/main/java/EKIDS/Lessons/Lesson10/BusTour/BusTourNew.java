package EKIDS.Lessons.Lesson10.BusTour;

import java.util.Scanner;

public class BusTourNew {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean checkFlag = false;

    public static void main(String[] args) {
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int[] array = readData(numberOfBridges);
        processData(busHeight, array, checkFlag);
    }

    public static int[] readData(int numberOfBridges) {
        int[] bridgesHeightArray = new int[numberOfBridges];
        for (int i = 0; i < bridgesHeightArray.length; i++) {
            bridgesHeightArray[i] = scanner.nextInt();
        }
        return bridgesHeightArray;
    }


    public static void processData(int busHeight, int[] bridgesHeightArray, boolean checkFlag) {
        for (int i = 0; i < bridgesHeightArray.length; i++) {
            if (busHeight >= bridgesHeightArray[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                checkFlag = false;
                break;
            } else {
                checkFlag = true;
            }
        }
        if (checkFlag) {
            System.out.println("Will not crash");
        }
    }
}
