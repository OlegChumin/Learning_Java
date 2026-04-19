package lesson_02;

public class SampleOfParametrizedClass_2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair_1 = new Pair<>("a", 1);
        System.out.println(pair_1.getVarTypeV1() + " " + pair_1.getVarTypeV2());

        Pair<Integer, Integer> pair_2 = new Pair<>(10, 15);
        System.out.println(pair_2.getVarTypeV1() + " " + pair_2.getVarTypeV2());

    }
}

class Pair<V1, V2> {
    private V1 varTypeV1;
    private V2 varTypeV2;

    public Pair(V1 varTypeV1, V2 varTypeV2) {
        this.varTypeV1 = varTypeV1;
        this.varTypeV2 = varTypeV2;
    }

    public V1 getVarTypeV1() {
        return varTypeV1;
    }

    public V2 getVarTypeV2() {
        return varTypeV2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "varTypeV1=" + varTypeV1 +
                ", varTypeV2=" + varTypeV2 +
                '}';
    }
}
