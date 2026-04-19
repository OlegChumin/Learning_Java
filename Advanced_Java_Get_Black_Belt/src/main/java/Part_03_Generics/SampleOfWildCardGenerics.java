package Part_03_Generics;

import java.util.ArrayList;
import java.util.List;

public class SampleOfWildCardGenerics {
    public static void main(String[] args) {
        //wild card - типа Joker - сильная карта
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add("Hallo");
        // bounded wile card - границы типов
        List<? extends Number> listNumber = new ArrayList<Integer>();


        List<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(3.15);
        listDouble.add(3.16);
        showListInfo(listDouble);

        List<String> listString = new ArrayList<>();
        listString.add("Hallo");
        listString.add("OK");
        listString.add("GoodBye");
        showListInfo(listString);

        System.out.println(summ((ArrayList<? extends Number>) listDouble));

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(3);
        listInteger.add(35);
        listInteger.add(30);
        System.out.println(summ((ArrayList<? extends Number>) listInteger));

//        System.out.printf(summ(listString));

        List<? super Number> newList = new ArrayList<Object>();

    }

    static void showListInfo(List<?> list) { // нельзя Object
        System.out.println(list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for(Number element : al) {
            summ += element.doubleValue();
        }
        return summ;
    }
}
