package lesson_02;

import java.util.ArrayList;

public class SampleOfTypeErasure {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList list = new ArrayList();
        list.add(1);

    }

//    public void someMethod(Information<Integer> info) {
//        // Information info
//        int value = info.getVariable();
//    }


    public void someMethod(Information<String> info) {
        // Information info
        String str = info.getVariable();
    }

}

class Information<T> {
    private T variable;

    public Information(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return "Information{" +
                "variable=" + variable +
                '}';
    }
}
