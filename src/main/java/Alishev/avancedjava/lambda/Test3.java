package Alishev.avancedjava.lambda;

public class Test3 {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("Hallo from thread"));
    }
}
