package Java_Oleg;

public class LearnClassObject {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Object objectOne = new Object();
        Object objectTwo = new Object();

        System.out.println("objectOne.equals(objectTwo:) " + objectOne.equals(objectTwo));
        System.out.println("objectOne == objectTwo: " + (objectOne == objectTwo));

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread started");
            }
        });

        thread.run();
//        thread.start();
//        thread.notifyAll();
//        thread.notify();
        int x = object.hashCode();
        System.out.println(x);
//        thread.wait(1000);
//        Thread.sleep(1000);
        System.out.println(thread.toString());

    }
}
