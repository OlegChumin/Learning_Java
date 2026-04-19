package lesson_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciMyVersion {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        printResultOnConsole(fibonacciMethod(readDataFromConsoleTryWithResources()));
        long timeEnd = System.currentTimeMillis();

        System.out.println("Время на работу метода readDataFromConsoleTryWithResources() = " +
                ((double) (timeEnd - timeStart) / 1000) + " seconds");
        System.out.println();


//        timeStart = System.currentTimeMillis();
//        printResultOnConsole(readDataFromConsole());
//        timeEnd = System.currentTimeMillis();
//        System.out.println("Время на работу метода readDataFromConsole() = " + (timeEnd - timeStart));
//        System.out.println();

    }

//    static int readDataFromConsole() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        int number;
//        try {
//            line = reader.readLine();
//            number = Integer.parseInt(line);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return number;
//    }

    /**
     * Метод readDataFromConsoleTryWithResources будет работать быстрее и предпочтительнее из-за использования
     * try-with-resources. Это связано с тем, что try-with-resources автоматически закрывает ресурсы после завершения
     * блока try, что позволяет избежать утечек ресурсов и сокращает объем кода.
     * <p>
     * В методе readDataFromConsole, BufferedReader не закрывается явно, что может привести к утечке ресурсов, если
     * метод вызывается в контексте другого метода или приложения с большим количеством операций ввода-вывода. Кроме
     * того, в этом методе объект BufferedReader создается вне блока try и закрывается явно, что усложняет код.
     * <p>
     * В методе readDataFromConsoleTryWithResources, BufferedReader создается внутри блока try-with-resources, и после
     * завершения блока try BufferedReader автоматически закрывается. Это упрощает код и гарантирует, что ресурсы будут
     * корректно закрыты даже в случае возникновения исключения. Поэтому второй метод предпочтительнее, и его
     * использование рекомендуется.
     */

    static long readDataFromConsoleTryWithResources() {
        long number;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Long.parseLong(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return number;
    }

    static void printResultOnConsole(Data data) {
        System.out.println("--------------------------------");
        System.out.printf("\"Получено число для рассчета ряда Фибоначчи = \" %d%n", data.getFibonacciSequence().size() - 1);
        System.out.println("--------------------------------");
        System.out.println("Последовательность Фибоначчи для заданного N " + data.getFibonacciSequence());
        System.out.println();
    }

    private static Data fibonacciMethod(long number) {
        List<Long> fibonacciSequience = new ArrayList<>();
        fibonacciSequience.add(0L);
        fibonacciSequience.add(1L);
        for (long i = 2; i <= number; i++) {
            fibonacciSequience.add(fibonacciSequience.get((int) (i - 1)) + fibonacciSequience.get((int) (i - 2)));
        }
        return new Data(fibonacciSequience);
    }


    private static final class Data {
        private final List<Long> fibonacciSequence;

        public Data(List<Long> fibonacciSequence) {
            if (fibonacciSequence == null) {
                throw new IllegalArgumentException("fibonacciSequence cannot not be NULL!");
            }
            // Создаем новый список и копируем элементы из переданного списка
            this.fibonacciSequence = new ArrayList<>(fibonacciSequence);
        }

        // Геттер для доступа к неизменяемому списку
        public List<Long> getFibonacciSequence() {
            // Возвращаем неизменяемую версию списка
            return Collections.unmodifiableList(fibonacciSequence);
        }
    }
}
