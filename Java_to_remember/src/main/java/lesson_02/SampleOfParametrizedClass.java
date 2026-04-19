package lesson_02;

public class SampleOfParametrizedClass {
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Hallo");
        System.out.println(infoString);
        String str = infoString.getNewVariable();

        Info<Integer> infoInteger = new Info<>(100);
        System.out.println(infoInteger);
        //String str2 = infoInteger.getNewVariable();


    }
}


class Info <T>{ // K, E, V
    private T newVariable;

    public Info(T newVariable) {
        this.newVariable = newVariable;
    }
    public T getNewVariable() {
        return newVariable;
    }

    @Override
    public String toString() {
        return "Info{" +
                "newVariable=" + newVariable +
                '}';
    }
}
