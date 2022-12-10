package Alishev.avancedjava.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * LinkedHashMap сохраняет порядок внесения
 * TreeMap (interface SortedMap) сортирует по ключу*/
public class Lesson007LinkedHashMap {
    public static void main(String[] args) {
//        Map<String, String> translations = new HashMap<>();
//        translations.put("кошка", "cat");
//        translations.put("собака", "dog");
//        translations.put("слон", "elephant");
//
//        for (Map.Entry<String, String> entry : translations.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        Map<Integer, String> hashMap = new HashMap<>(); //yt гарантируется порядка после внесения
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //гарантируется порядок согласно внесению
        Map<Integer, String> treeMap = new TreeMap<>(); //гарантируется сортировку по ключу (цифры понятно буквы
        // и слова лексикографически, объекты см. далее уроки

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
}
