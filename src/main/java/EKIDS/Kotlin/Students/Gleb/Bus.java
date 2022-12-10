package Kotlin.Students.Gleb;

import java.util.Scanner;

public class Bus {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int busheight = s.nextInt();
        int bridgecount = s.nextInt();
        int bridgeheight = s.nextInt();
        boolean willcrash = false;
        int count = 0;
        for (int bridgeIndex = 0; bridgeIndex < bridgecount; bridgeIndex++) {
            bridgeheight = s.nextInt();
            if (bridgeheight <= busheight) {
                willcrash = true;
                System.out.println("сломался на мосту номер " + bridgeIndex);
                break;
            }
            if (!willcrash) {
                System.out.println("мост остался цел");
            }


        }
    }

}