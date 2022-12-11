package JetBrainsAcademy;

import java.util.Scanner;

public class BusesAndBridges {
    public static void main(String[] args) {
        Scanner readDataFromKeyboard = new Scanner(System.in);
        int busHeight = readDataFromKeyboard.nextInt();
        int numberOfBridges = readDataFromKeyboard.nextInt();

        System.out.println("высота автобуса в см: " + busHeight);
        System.out.println("количество мостов: " +numberOfBridges);

        int[] arrayOfBridgesHeight = new int[numberOfBridges];
        System.out.println(arrayOfBridgesHeight.length);

    }
}
