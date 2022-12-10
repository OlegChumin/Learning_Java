package Alishev.Testing.old;

public class NetWorkUtils {
    public static void getConnection() {
        //получаем соединение с сервером
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
