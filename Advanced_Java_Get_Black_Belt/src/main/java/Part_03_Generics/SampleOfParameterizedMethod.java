package Part_03_Generics;

import java.util.ArrayList;

public class SampleOfParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(5);
        int a = GetMethod.getSecondElement(al);
        System.out.println(a);
        System.out.println();
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("efg");
        al2.add("hij");
        System.out.println(GetMethod.getSecondElement(al2));
    }

}

class GetMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

class NewPair<V> {
    private V var1TypeV;
    private V var2TypeV;

    public NewPair(V var1TypeV, V var2TypeV) {
        this.var1TypeV = var1TypeV;
        this.var2TypeV = var2TypeV;
    }

    public V method_V(V variable) { // можно удалить <V>
        return variable;
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
