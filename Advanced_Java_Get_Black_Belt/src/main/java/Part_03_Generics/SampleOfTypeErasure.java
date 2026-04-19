package Part_03_Generics;

import java.util.ArrayList;

public class SampleOfTypeErasure {
    // для обратной совместимости происходит стирание типов при компиляции
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = al.get(0);
//        ArrayList al = new ArrayList();
//        int i = (Integer) al.get(0) // raw type -> JVM
    }


//    public void abc(NewInfo<String> info) { // нельзя создавать такие overloaded методы после type erasure
//        // будут одинаковы по сигнатуре
//        String str = info.getNewVariable();
//    }

    public void abc(NewInfo<Integer> info) {
        Integer i = info.getNewVariable();
    }


}

class Parent {
    public void abc(NewInfo<String> info) {
        String str = info.getNewVariable();
    }
}

class Child extends Parent{
//    @Override
//    public void abc(NewInfo<Integer> info) {
//        Integer i = info.getNewVariable();
//    }
}


class NewInfo <T> { // T - type placeHolder also K, E, V
    private T newVariable; // cannot be static

    public NewInfo(T newVariable) {
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


