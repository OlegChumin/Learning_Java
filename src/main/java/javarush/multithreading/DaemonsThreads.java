package javarush.multithreading;

public class DaemonsThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("Daemon thread running"));
        thread.setDaemon(true);
        thread.start();
    }
}
