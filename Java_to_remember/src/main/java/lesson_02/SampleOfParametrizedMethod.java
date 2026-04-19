package lesson_02;

import java.util.ArrayList;
import java.util.List;

public class SampleOfParametrizedMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(37);

        int secondElement = GetMethod.getSecondElement(list); //
        System.out.println(secondElement);


    }
}

class GetMethod {
    public static <T> T getSecondElement(List<T> arrayList) {
        return arrayList.get(1);
    }
}
