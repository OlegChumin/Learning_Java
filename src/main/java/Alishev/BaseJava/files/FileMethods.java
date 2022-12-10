package Alishev.BaseJava.files;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        File file = new File("./images/javaInformation.txt"); // не создает реальный файл в данный момент
        System.out.println("File name " + file.getName());
        System.out.println("File path " + file.getPath());
        System.out.println("Is file " + file.isFile());
        System.out.println("Is directory " + file.isDirectory());
        System.out.println("Exist " + file.exists());
        System.out.println("Parent path " + file.getParent());
        System.out.println("Can read " + file.canRead() + "; " + "Can Write " + file.canWrite() + "; " +
                "Can Execute " + file.canExecute() + ";");
    }
}
