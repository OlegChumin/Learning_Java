package Advanced_Java.Part_02_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList2 {
    public static void main(String[] args) {
        /**
         * при инициализации внутренний массив DEFAULT_CAPACITY = 10

         *
         */
        List<Integer> arrayList = new ArrayList<>();

        /**
         * Если известен примерный размер заранее можно сразу задать размер - что ускорит процесс инициализации
         */
        List<Integer> arrayListBig = new ArrayList<>(1_000_000);


        /**
         * trimToSize()                                  — Обрезает массив до текущего размера списка
         * public void ensureCapacity(int minCapacity)   — Гарантирует нужную ёмкость для добавления элементов
         * private static int calculateCapacity(Object[] elementData, int minCapacity) — Вычисляет новую ёмкость массива
         * private void ensureCapacityInternal(int minCapacity)      — Проверяет, хватает ли текущей ёмкости
         * private void ensureExplicitCapacity(int minCapacity)      — Явная проверка перед расширением массива
         * private void grow(int minCapacity)                        — Расширяет массив (обычно x1.5)
         * private static int hugeCapacity(int minCapacity)          — Обрабатывает превышение максимально допустимого размера
         * private void grow(int minCapacity)                        — Реальное расширение массива
         */
        int minCapacity = 100;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.ensureCapacity(minCapacity);
        integerArrayList.isEmpty();
        ArrayList<Integer> integerArrayList2 = (ArrayList<Integer>) integerArrayList.clone(); //кастим, потому что clone возвращает Object

        // <T> T[] toArray(T[] a)  new Integer[0] - [0] чтобы не было на хвосте null например [1, 2, null, null, null, null, null, null, null, null] -> NPE == NullPointerException
        Integer[] copiedArray = Arrays.copyOf(integerArrayList.toArray(new Integer[0]), integerArrayList.size());
        }
}
