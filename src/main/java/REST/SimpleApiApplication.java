package REST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Аннотация @SpringBootApplication объединяет три другие аннотации:
// @Configuration - указывает на то, что класс содержит конфигурацию Spring
// @EnableAutoConfiguration - настраивает приложение на основе классов находящихся в classpath
// @ComponentScan - сканирует классы в поисках компонентов, которые могут быть подключены к контексту приложения
@SpringBootApplication
public class SimpleApiApplication {

    public static void main(String[] args) {
        // Вызываем статический метод run из класса SpringApplication,
        // чтобы запустить приложение Spring Boot. Передаем два аргумента:
        // - класс, который инициализирует контекст приложения
        // - аргументы командной строки, передаваемые приложению
        SpringApplication.run(SimpleApiApplication.class, args);
    }
}
