package lesson_02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SampleOfGenerics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Object());
        list.add("OK");
        list.add(10f);
        list.add('H');
        list.add(true);
        list.add(new StringBuffer("Hi"));
        list.add(new StringBuilder("Hallo"));

        for (Object element : list) {
            System.out.println(element);
        }

        List listString = new ArrayList();
        list.add("OK");
        list.add('H');
        list.add("Hi");
        list.add("Hallo");

        for (Object element : listString) {
            System.out.println(element); //?
        }
    }
}
