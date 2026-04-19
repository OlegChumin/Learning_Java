package Part_02_Interfaces_Comparable_and_Comparator;

import java.util.Arrays;

/**
 * В этой реализации метод hashCode() вычисляет хеш-код на основе содержимого массива символов value[].
 * Он использует стандартный алгоритм, который является хорошо зарекомендовавшим себя в практике.
 *
 * Ключевая часть этого алгоритма - это строка h = 31 * h + value[i];. Она вычисляет хеш-код,
 * учитывая каждый символ строки и их позиции. Множитель 31 был выбран, потому что это простое число и
 * обычно обеспечивает хорошее распределение хеш-кодов.
 */
public class HashCodeString {
    private final char[] value;

    public HashCodeString(char[] value) {
        this.value = Arrays.copyOf(value, value.length); // создать копию массива, не изменяя исходный массив
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (int i = 0; i < value.length; i++) {
            // 31 - небольшие простые числа обычно предпочтительны для использования в качестве множителя,
            // потому что они помогают уменьшить количество коллизий (когда два разных объекта имеют одинаковый хеш-код).
            h = 31 * h + value[i];
        }
        return h;
    }
}

class Main {
    public static void main(String[] args) {
        String firstStr = new String("Hello World");
        String secondStr = new String("Hello World Hello World");

        System.out.println("firstStr.hashCode() = " + firstStr.hashCode());
        System.out.println("secondStr.hashCode() = " + secondStr.hashCode());
    }
}
