package Java_Oleg.thinkinginjava.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrintDirList {

    public static void main(String[] args) throws IOException {
        String dirPath = null;
        Scanner scanner = new Scanner(System.in);
        dirPath = scanner.nextLine();           // считывает в перменную scanner клавиатуры System.in
        File dir = new File(dirPath);
    }
}

