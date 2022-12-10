package Alishev.avancedjava.lambda;

public class TestLambda {
    public static void main(String[] args) {
    Objective obj = new Objective();
    }
}

class Objective implements Runnable {

    @Override
    public void run() {
        System.out.println("HALLO");
    }
}


