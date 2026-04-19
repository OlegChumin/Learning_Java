package Advanced_Java.Part_02_Collections;

import java.util.*;

import static java.lang.Math.random;

public class TestArrayList1 {

    private final static Random random = new Random();
    private final static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int[] testArray = new int[ARRAY_LENGTH];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(testArray));

        try {
            testArray[ARRAY_LENGTH + 1] = random.nextInt(2);
        } catch (Exception e) {
            System.out.println("Превышение размера массива");
            //throw new ArrayIndexOutOfBoundsException(String.valueOf(e));
        }
        System.out.println();

        /**
         * List — это generic, он требует ссылочный тип.
         * Generic в Java реализованы через type erasure (стирание типа)
         * в рантайме все дженерики работают через Object.
         * Но примитивы (int, long, boolean) — не наследники Object, и ты не можешь их просто так засунуть в Object.
         * JVM не поддерживает int как Object без boxing-а.
         */
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println("arrayList first element = " + arrayList.get(0) + " arrayList last element = " + arrayList.get(arrayList.size() - 1));
        System.out.println("arrayList size = " + arrayList.size());
        for (Integer element: arrayList) {
            System.out.print(" " + element);
        }
        System.out.println();
        arrayList.stream().forEach(element -> System.out.print(" " + element));
        System.out.println();
        arrayList.stream().forEach(System.out :: print);
        System.out.println();

        System.out.println(arrayList);
        arrayList.remove(5);
        arrayList.remove(7);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(0));
        System.out.println(arrayList.contains(11));
        System.out.println(arrayList);
        arrayList.add(5, 89);
        System.out.println(arrayList);

        /**
         * ArrayList.add(index, element) работает за O(n) — нужно сдвигать все элементы. Мгновенный доступ (O(1)) по индексу.
         * Если ты вставляешь не в конец, то ArrayList делает такие шаги:
         * 1. Выделяет место, если не хватает (resize → O(n))
         * 2. Сдвигает все элементы справа от позиции вправо (System.arraycopy) → O(n)
         * 3. Записывает новый элемент
         *
         * LinkedList.add(index, element) работает за O(n) для поиска позиции, но без сдвига, вставка — O(1).
         * Java делает оптимизацию: если index > size/2, она идёт от хвоста назад
         * в LinkedList хоть и есть линейный проход, но нет сдвигов, копирования и перевыделения массива, как у ArrayList.
         */
        List<Integer> linkedList = new LinkedList<>(arrayList);
        System.out.println("linkedList = " + linkedList);
    }

}
