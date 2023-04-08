package Java_streams;
/**
 * В Java Streams существует множество интерфейсов, которые предоставляют разные возможности для работы с потоками
 * данных. Некоторые основные интерфейсы включают:
 *
 * Stream: основной интерфейс для работы с потоками объектов. Он предоставляет методы для трансформации, фильтрации,
 * сортировки и обработки элементов потока.
 *
 * IntStream, LongStream, DoubleStream: специализированные интерфейсы для работы с потоками примитивных типов данных
 * (int, long, double соответственно). Они предоставляют аналогичные методы, что и Stream, но оптимизированные для
 * работы с примитивными типами.
 *
 * Collector: интерфейс, который определяет, как агрегировать элементы потока в один результат. Используется в методе
 * collect() потока.
 *
 * Collectors: вспомогательный класс, предоставляющий статические методы для создания различных видов Collector.
 * Например, toList(), toSet(), toMap() и другие.
 *
 * Function: интерфейс, представляющий функцию, которая принимает один аргумент и возвращает результат. Используется
 * в методах потока, таких как map().
 *
 * Predicate: интерфейс, представляющий условие, которое принимает один аргумент и возвращает булево значение.
 * Используется в методах потока, таких как filter().
 *
 * Consumer: интерфейс, представляющий операцию, которая принимает один аргумент и не возвращает результат.
 * Используется в методе forEach() потока.
 *
 * Supplier: интерфейс, представляющий поставщика, который не принимает аргументов и возвращает результат.
 * Используется для генерации потока элементов с помощью метода generate().
 *
 * UnaryOperator: интерфейс, представляющий функцию, которая принимает один аргумент и возвращает результат того же
 * типа. Используется в методе iterate() потока.
 *
 * Comparator: интерфейс, представляющий компаратор, который сравнивает два объекта и возвращает результат сравнения.
 * Используется в методах потока, таких как sorted().
 *
 * Optional, OptionalInt, OptionalLong, OptionalDouble: контейнерные объекты, которые могут содержать или не содержать
 * значения. Используются для предотвращения NullPointerException и предоставления удобных методов для работы с
 * отсутствующими значениями.
 *
 * Это не полный список всех интерфейсов, связанных с Java Streams, но это основные интерфейсы, которые вы будете
 * использовать при работе с потоками данных.
 * */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExamples {

    public static void main(String[] args) {
        // Создаем список чисел для демонстрации примеров Java Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Пример filter(): отфильтровать только четные числа
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Четные числа: " + evenNumbers);

        // Пример map(): умножить каждое число на 2
        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
        System.out.println("Умноженные на 2 числа: " + doubledNumbers);

        // Пример reduce(): сумма всех чисел в списке
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Сумма всех чисел: " + sum);

        // Пример forEach(): вывод всех чисел списка на экран
        System.out.println("Все числа списка: ");
        numbers.stream()
                .forEach(System.out::println);

        // Пример sorted(): сортировка чисел в списке по убыванию
        List<Integer> sortedNumbers = numbers.stream()
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        System.out.println("Сортировка чисел по убыванию: " + sortedNumbers);

        // Пример anyMatch(): проверка, есть ли в списке число больше 10
        boolean anyGreaterThanTen = numbers.stream()
                .anyMatch(number -> number > 10);
        System.out.println("Есть ли число больше 10: " + anyGreaterThanTen);

        // Пример allMatch(): проверка, все ли числа меньше 20
        boolean allLessThanTwenty = numbers.stream()
                .allMatch(number -> number < 20);
        System.out.println("Все ли числа меньше 20: " + allLessThanTwenty);

        // Пример noneMatch(): проверка, что ни одно число не равно 0
        boolean noneEqualToZero = numbers.stream()
                .noneMatch(number -> number == 0);
        System.out.println("Ни одно число не равно 0: " + noneEqualToZero);

        // Пример concat(): объединение двух потоков
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        List<Integer> combinedStreams = Stream.concat(stream1, stream2)
                .collect(Collectors.toList());
        System.out.println("Объединение двух потоков: " + combinedStreams);

        // Пример IntStream.range(): создание потока последовательных целых чисел в заданном диапазоне
        IntStream rangeStream = IntStream.range(1, 11);
        List<Integer> rangeList = rangeStream.boxed().collect(Collectors.toList());
        System.out.println("Поток чисел в диапазоне от 1 до 10: " + rangeList);

        // Пример flatMap(): преобразование каждого элемента потока в другой поток и создание единого потока
        List<String> words = Arrays.asList("Привет", "мир", "Java", "Streams");
        List<String> letters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println("Буквы всех слов: " + letters);

        // Пример distinct(): удаление дубликатов из потока
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10, 10);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Удаление дубликатов из потока: " + distinctNumbers);

        // Пример limit(): ограничение размера потока до указанного значения
        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Ограничение размера потока: " + limitedNumbers);

        // Пример skip(): пропуск указанного количества элементов в потоке
        List<Integer> skippedNumbers = numbers.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("Пропуск первых 5 элементов: " + skippedNumbers);

        // Пример count(): подсчет количества элементов в потоке
        long count = numbers.stream()
                .count();
        System.out.println("Количество элементов в потоке: " + count);
    }
}

