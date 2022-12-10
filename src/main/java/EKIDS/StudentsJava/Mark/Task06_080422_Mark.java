package EKIDS.StudentsJava.Mark;

public class Task06_080422_Mark {
    public static void main(String[] args) throws InterruptedException {
        int a = 99;
        String ANSI_Red = "\u001B[31m";
        String ANSI_Reset = "\u001B[0m";
        while (a >= 0) {
            Thread.sleep(500);
            System.out.print("\r\r" + ANSI_Red + a);
            a--;
        }
        System.out.println(ANSI_Reset);
    }
}