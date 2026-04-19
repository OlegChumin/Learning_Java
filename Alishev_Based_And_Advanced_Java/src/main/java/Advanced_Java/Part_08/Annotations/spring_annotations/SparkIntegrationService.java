package Advanced_Java.Part_08.Annotations.spring_annotations;

//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.stereotype.Service;

/**
 * @Slf4j (Lombok): Создает поле логгера в классе (log) для использования логирования (принадлежит к библиотеке
 * Lombok).
 * Это избавляет от необходимости вручную объявлять экземпляр логгера в каждом классе.
 *
 * @RequiredArgsConstructor (Lombok): Генерирует конструктор с обязательными аргументами для инициализации
 * финальных полей и полей с аннотацией @NonNull. В нашем случае, это создаст конструктор, который требует
 * передачи экземпляра SomeDependency.
 *
 * @Service (Spring): Обозначает класс как компонент сервисного слоя в контексте Spring, делая его кандидатом
 * для обнаружения через сканирование класспатов и автоматической инъекции зависимостей.
 * Семантика: @Service и @Component предназначены для аннотирования классов и автоматического обнаружения компонентов
 * через сканирование класспатов. @Service используется для бизнес-логики, а @Component — для более общих компонентов. @Bean используется для явной регистрации бинов в конфигурационных классах.
 * Использование: @Bean подходит для случаев, когда создание бина требует сложной логики инициализации, или когда
 * нужно создать бин стороннего класса, который не может быть аннотирован как @Component или @Service.
 * Контекст: @Service и @Component в основном используются в автоматическом режиме конфигурации, когда Spring сам
 * находит и регистрирует бины. @Bean используется в явной конфигурации, когда разработчик указывает Spring, как
 * создавать и конфигурировать бины.
 *
 * @ConditionalOnProperty (Spring Boot): Указывает, что компонент должен быть создан только если указанное
 * свойство конфигурации ("feature-flag.spark-integration.unimock.enabled") установлено в true. Это позволяет
 * динамически включать или отключать определенные функции на основе конфигурации приложения.
 *
 * Инъекция зависимости: SomeDependency someDependency будет автоматически инжектировано благодаря использованию
 * конструктора, сгенерированного Lombok'ом через @RequiredArgsConstructor.
 *
 * Инъекция значения свойства: Аннотация @Value используется для инъекции значения свойства из конфигурации
 * приложения (application.properties или application.yml) в поле unimockUrl. Это позволяет динамически задавать
 * параметры конфигурации.
 *
 * Логирование действия: Использование log.info для записи информационного сообщения в журнал. Здесь логируется
 * попытка интеграции с UniMock с указанием URL.
 *
 * Предупреждение о неправильной конфигурации: Если URL не настроен, используется log.warn для записи
 * предупреждающего сообщения.
 */

//@Slf4j // 1
//@RequiredArgsConstructor // 2
//@Service // 3
//@ConditionalOnProperty(value = "feature-flag.spark-integration.unimock.enabled") // 4
//public class SparkIntegrationService {
//
//    private final SomeDependency someDependency; // 5
//
//    @Value("${feature-flag.spark-integration.unimock.url}") // 6
//    private String unimockUrl;
//
//    public void integrate() {
//        if (unimockUrl != null && !unimockUrl.isEmpty()) {
//            log.info("Integrating with UniMock at {}", unimockUrl); // 7
//            // Здесь будет логика интеграции
//        } else {
//            log.warn("UniMock URL is not configured."); // 8
//        }
//    }
//}
//
//class SomeDependency {
//
//}
