import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import JUnit_Mockito.SimpleCalculator;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        // Создаем mock объект для SimpleCalculator
        SimpleCalculator calculator = mock(SimpleCalculator.class);

        // Настраиваем поведение mock объекта
        when(calculator.add(2, 3)).thenReturn(5);

        // Вызываем метод add()
        int result = calculator.add(2, 3);

        // Проверяем, что результат равен 5
        assertEquals(5, result);
    }
}
