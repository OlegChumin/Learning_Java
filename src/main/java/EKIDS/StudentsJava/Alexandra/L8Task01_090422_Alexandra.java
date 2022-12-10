package EKIDS.StudentsJava.Alexandra;

public class L8Task01_090422_Alexandra {
    public static void main(String[] args) throws InterruptedException {

        String  ANSI_B = "\u001B[30m";
        String ANSI_RESET = "\u001B[0m";
        String BACKGR = "\u001B[41m";
        String BACKGR_RESET = "\u001B[0m";
        System.out.println(BACKGR + ANSI_B +"Cчетчик от 99 до 0" + ANSI_RESET + BACKGR_RESET);

        String ANSI_B1 = "\u001B[31m";
        String ANSI_RESET1 = "\u001B[0m";
        String BACKGR1 = "\u001B[46m";
        String BACKGR_RESET1 = "\u001B[0m";
        for (int i = 99; i >-1 ; i--) {
            System.out.print(BACKGR1 + ANSI_B1 + "\r\r" + i + ANSI_RESET1  + BACKGR_RESET1);
            Thread.sleep(80);
        }
    }
}
