package Java_Zaur_Tregulov.old.GetBlackBelt.Generics;

public class ParametriziedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hi");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        String s = info1.getValue();
        Integer s1 = info2.getValue();
    }


}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}