package Advanced_Java.Part_07_TestingWithJUnit_037_039;

public class NetworkUtils {
    public static void getConnection() {
        // получаем соединение с сервером 1 сек
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
