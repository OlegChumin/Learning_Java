package lesson_09;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack { //https://translate.google.ru/?sl=en&tl=ru&text=Knapsack&op=translate
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};

        //сортируем в обратном порядке по удельной ценности
        //(item) -> item.valuePerUnitOFWeight()
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOFWeight).reversed()); // O(n log(n))

        System.out.println(Arrays.toString(items));

        final int W = 7; //Вес рюкзака

        // аккумулированный текущий вес
        int weightSoFar = 0; //https://translate.google.ru/?sl=en&tl=ru&text=weight%20So%20Far&op=translate

        double valueSoFar = 0; // аккумулированная текущая ценность

        int currentItem = 0; // индекс текущего предмета

        while (currentItem < items.length && weightSoFar != W) {
            if (weightSoFar + items[currentItem].getWeight() < W) {
                //берем объект целиком
                valueSoFar += items[currentItem].getValue(); // прибавили ценность
                weightSoFar += items[currentItem].getWeight(); // прибавляем вес

            } else {
                // берем только часть объекта
                                //вычисляем сколько веса можем взять и делим на полный вес объекта
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) *
                        items[currentItem].getValue(); // и получаем часть value которую сможем добавить
                weightSoFar = W; // рюкзак заполнился
            }
            currentItem++;
        }
        System.out.println("Ценность наилучшего набора = " + valueSoFar);
    }
}

class Item {
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }

    public double valuePerUnitOFWeight() {
        return value / (double) weight;
    }
}
