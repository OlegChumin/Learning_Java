package UdemyZaur.GetBlackBelt.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        // add
        list1.add("Zaur");
        list1.add("Ivan");
        list1.add("Maria");
        list1.add("Oleg");
        list1.add("Otto");
        list1.add("Otto");
//        list1.add("Igor");
//        System.out.println("list1 = " + list1);
//        List<String> list3 = list1.subList(1, 4); //получение sublist с [1 по 3]
//        System.out.println("list3 = sublist(list1) = " + list3);//list3 только представление он не существует отдельно от List
//        System.out.println();
//
//        list3.add("Fedor");
//        System.out.println("list3 = sublist(list1) = " + list3);
//        System.out.println("list1 = " + list1); //Fedor добавился и в list1 сразу после Oleg 3]
//        System.out.println();

//        list1.add("Vova");
//        System.out.println("list1 = " + list1);
//        System.out.println(list3); //ConcurrentModificationException если сделал sublist добавляй элементы через sublist

//        Object[] array = list1.toArray();
//        String[] arrayOfStrings = list1.toArray(new String[list1.size()]);
//        for (String element :  arrayOfStrings) {
//            System.out.print(element + " ");
//        }

        List<String> list2 = new ArrayList<String>();
        // add
        list2.add("Zaur");
        list2.add("Igor");
        list2.add("Maria");
//        System.out.println(list2);

//        list1.removeAll(list2); //удаляет все элементы из list 1 которые совпадают с элементами в list 2
//        list1.retainAll(list2); //удаляет все элементы из list 1 которые не совпадают с элементами в list 2
//        System.out.println(list1.containsAll(list2)); //наличие всех элементов list2 в list1
        //       System.out.println(list1);

        List<Integer> list4 = List.of(8, 16, 12); //создает неизменяемый list
        List<String> list5 = List.copyOf(list1);  //null запрещен
        System.out.println(list5);
        System.out.println(list4);
    }
}
