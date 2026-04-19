package Part_03_Generics;

public class SampleOfParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hallo");
        System.out.println(info1);
        String str = info1.getNewVariable();

        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);
    }
}

class Info <T> { // T - type placeHolder also K, E, V
    private T newVariable; // cannot be static

    public Info(T newVariable) {
        this.newVariable = newVariable;
    }

    public T getNewVariable() {
        return newVariable;
    }

    @Override
    public String toString() {
        return "Info{" +
                " newVariable = " + newVariable +
                '}';
    }
}
