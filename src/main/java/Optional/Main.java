package Optional;
/**
 * Класс Optional в Java представляет контейнерный объект, который может содержать значение или быть пустым
 * (не содержать значение). Этот класс был введен в Java 8 и является решением для работы с потенциально отсутствующими
 * значениями, избегая использования null и связанных с ним проблем, таких как NullPointerException.
 *
 * Optional используется для явного указания того, что значение может быть отсутствующим, и обеспечивает набор методов
 * для безопасного доступа к содержимому, обработки отсутствующих значений и выполнения различных операций с этими
 * значениями.
 *
 * Некоторые основные преимущества использования Optional:
 *
 * Ясность кода: Использование Optional явно указывает на возможность отсутствия значения и принуждает разработчиков к
 * обработке таких случаев.
 * Избегание ошибок NullPointerException: Optional предоставляет безопасные методы для работы с данными, что помогает
 * избежать NullPointerException.
 * Функциональный стиль: Optional поддерживает функциональный стиль программирования, предоставляя такие методы, как
 * map(), filter(), flatMap(), ifPresent(), и orElse().
 * Пример использования Optional:
 * */

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> nameOptional = getName();
        
        // Если значение присутствует, выполнить лямбда-выражение
        nameOptional.ifPresent(name -> System.out.println("Name: " + name));
        
        // Получить значение или использовать альтернативное значение, если оно отсутствует
        String nameOrDefault = nameOptional.orElse("Default Name");
        System.out.println("Name or default: " + nameOrDefault);
    }
    
    private static Optional<String> getName() {
        // Возвращает Optional с присутствующим значением
        return Optional.of("John");
        
        // Для симуляции отсутствующего значения можно использовать:
        // return Optional.empty();
    }
}
