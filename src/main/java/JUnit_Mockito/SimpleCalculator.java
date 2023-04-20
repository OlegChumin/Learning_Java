package JUnit_Mockito;

public class SimpleCalculator {
    private int result;

    public int add(int a, int b) {
        result = a + b;
        return result;
    }

    public int getResult() {
        return result;
    }
}
