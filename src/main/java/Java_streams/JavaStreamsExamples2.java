package Java_streams;

import java.util.*;
import java.util.stream.*;

public class JavaStreamsExamples2 {

    public static void main(String[] args) {

        // Пример anyMatch(): проверка, удовлетворяет ли хотя бы один элемент условию
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean anyMatchResult = numbers.stream()
                .anyMatch(n -> n > 8);
        System.out.println("Есть ли числа больше 8: " + anyMatchResult);

        // Пример allMatch(): проверка, удовлетворяют ли все элементы условию
        boolean allMatchResult = numbers.stream()
                .allMatch(n -> n < 20);
        System.out.println("Все ли числа меньше 20: " + allMatchResult);

        // Пример noneMatch(): проверка, что ни один элемент не удовлетворяет условию
        boolean noneMatchResult = numbers.stream()
                .noneMatch(n -> n > 20);
        System.out.println("Нет ли чисел больше 20: " + noneMatchResult);

        // Пример findFirst(): поиск первого элемента потока (возвращает Optional)
        Optional<Integer> firstNumber = numbers.stream()
                .findFirst();
        System.out.println("Первое число: " + firstNumber.orElse(-1));

        // Пример findAny(): поиск любого элемента потока (возвращает Optional)
        Optional<Integer> anyNumber = numbers.stream()
                .findAny();
        System.out.println("Любое число: " + anyNumber.orElse(-1));

        // Пример toArray(): конвертация потока в массив
        Integer[] numberArray = numbers.stream()
                .toArray(Integer[]::new);
        System.out.println("Массив чисел: " + Arrays.toString(numberArray));

        // Пример reduce(): сокращение потока до одного значения с использованием аккумулятора
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("Сумма всех чисел: " + sum.orElse(-1));

        // Пример max() и min(): нахождение максимального и минимального значения с использованием компаратора
        Optional<Integer> max = numbers.stream()
                .max(Comparator.naturalOrder());
        Optional<Integer> min = numbers.stream()
                .min(Comparator.naturalOrder());
        System.out.println("Максимальное число: " + max.orElse(-1));
        System.out.println("Минимальное число: " + min.orElse(-1));

        // Пример IntStream.of(): создание потока из списка целых чисел
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        List<Integer> intStreamList = intStream.boxed().collect(Collectors.toList());
        System.out.println("Поток из списка целых чисел: " + intStreamList);

    }
}
