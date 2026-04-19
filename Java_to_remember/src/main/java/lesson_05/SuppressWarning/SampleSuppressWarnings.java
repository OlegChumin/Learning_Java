package lesson_05.SuppressWarning;

import java.util.ArrayList;
import java.util.List;

public class SampleSuppressWarnings {
    public static void main(String[] args) {
        SampleSuppressWarnings suppressWarnings = new SampleSuppressWarnings();
        List list = new ArrayList();
        suppressWarnings.addToList(list, "Hello");
        suppressWarnings.addToList(list, new Integer(123));
        System.out.println(list);

    }

    @SuppressWarnings("unchecked")
    public void addToList(List rawList, Object element) {
        rawList.add(element);
    }
}
