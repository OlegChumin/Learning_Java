package Part_03_Generics;

import java.util.ArrayList;

public class SampleOfTSubtypinginGenerics {
    public static void main(String[] args) {
        X x = new Y();
//        List<X> list1 = new ArrayList<Y>(); // ставит <X> по умолчанию -> не являтся подтипом List<X>
//        List<Number> list = new ArrayList<Integer>(); // хотя Integer сабкласс Number!
//        list.add(18);
//        list.add(3.14);

        Info<Bus> superInfo = new Info<>(new Bus());
        System.out.println(superInfo);
        Bus bus = superInfo.getNewVariable();

        LimitedInfo<Double> limitedInfo1 = new LimitedInfo<>(3.14);
        System.out.println(limitedInfo1.getNewVariable());
        LimitedInfo<Integer> limitedInfo2 = new LimitedInfo<>(5);
        System.out.println(limitedInfo2.getNewVariable());
    }
}

class X {
}

class Y extends X {
}

class SuperInfo<T> { // T - type placeHolder also K, E, V
    private T newVariable; // cannot be static

    public SuperInfo(T newVariable) {
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

class GetMethodNew {
    public static <T extends Number&I1&I2> T getSecondElement(ArrayList<T > arrayList) {
        return arrayList.get(1); // ArrayList<T extends Number> нельзя
    }
}

interface I1{}
interface I2{}

class LimitedInfo<T extends Number> { // T - type placeHolder also K, E, V
//    class LimitedInfo<T extends Number & I1 & I2> { // T - type placeHolder also K, E, V
    private T newVariable; // cannot be static

    public LimitedInfo(T newVariable) {
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

class Bus {
}