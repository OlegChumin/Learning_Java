package Java_Nail_Alishev.old.Testing;

public class NetworkUtilsNew {
    public static void getConnection() { // получение соединения к серверу
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
