package Part_03_Generics;

public class SampleOfParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hallo", 20);
        System.out.println(pair1.getVarTypeV1() + " " + pair1.getVarTypeV2());

        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println(pair2.getVarTypeV1() + " " + pair1.getVarTypeV2());

        PairSame<String> pair3 = new PairSame<>("Hi", "Bye!");
        System.out.println(pair3);
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
}

class PairSame<V> {
    private V var1TypeV;
    private V var2TypeV;

    public PairSame(V var1TypeV, V var2TypeV) {
        this.var1TypeV = var1TypeV;
        this.var2TypeV = var2TypeV;
    }

    public V getVar1TypeV() {
        return var1TypeV;
    }

    public V getVar2TypeV() {
        return var2TypeV;
    }

    @Override
    public String toString() {
        return "PairSame{" +
                "var1TypeV=" + var1TypeV +
                ", var2TypeV=" + var2TypeV +
                '}';
    }
}
