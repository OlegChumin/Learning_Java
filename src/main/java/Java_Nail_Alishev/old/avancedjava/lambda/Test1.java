package Java_Nail_Alishev.old.avancedjava.lambda;

public class Test1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //здесь можно писать код для исполнения в потоке thread1
            }
        });

        Thread thread2 = new Thread(() -> {
            //здесь можно писать код для исполнения в потоке thread2
        });
    }
}
