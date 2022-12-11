package Java_Zaur_Tregulov.old.GetBlackBelt.Generics;

public class ParametriziedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Oleg", 45);
        System.out.println("value1 = " + pair.getValue1() + "   value2 = " + pair.getValue2());
        Pair<Integer, Double> pair2 = new Pair<>(45, 3.14);
        System.out.println("value1 = " + pair2.getValue1() + "   value2 = " + pair2.getValue2());
        AsPair<String> as = new AsPair<>("Oleg", "Chumin");
        System.out.println("value1 = " + as.getValue1() + "   value2 = " + as.getValue2());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class AsPair<V> {
    private V value1;
    private V value2;

    public AsPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
