package Java_Nail_Alishev.old.collections;

import java.util.HashMap;
import java.util.Map;

public class Lesson006HashMap {
    public static void main(String[] args) {
        // 1-> [.. .. ..]
        // 2 ->[.. .. ..]
        Map<Integer, String> hashMap = new HashMap<>(); //ассоциативный массив хранящий ключ-значение
        hashMap.put(1, "один");
        hashMap.put(2, "два");
        hashMap.put(3, "три");
        hashMap.put(3, "четыре"); //перезаписывает не может быть дубликатов ключей, ключи уникальны
        System.out.println(hashMap);
        // класс HashMap не гарантирует никакого порядка после внесения
        // если нужен порядок соответствующий порядку внесения или сортировать нужен другой класса

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(10));

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
