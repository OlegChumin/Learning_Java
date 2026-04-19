package Advanced_Java.Part_07_TestingWithJUnit_037_039;

public class Part_037_TestCase {
    /**
     * Артефакт - артефакт, описывающий совокупность шагов, условий и параметров необходимых для проверки
     * реализации тестируемой функции
     * Action -> Expected Result -> Test Result
     * Open page "login" -> Login page is opened -> Passed
     *
     *
     * модульное тестирование - JUnit (проводится программистом) - низкоуровневое тестирование
     * (тест воспроизводит какие-то данные и воспроизводит действия, далее исполнение тестируемого метода)
     * ожидание сравнивается с результатом Assert (сопоставление)
     * интеграционное тестирование - совместная работа нескольких модулей
     * системное тестирование - проверка работы системы в целом (тестировщик)
     *
     *
     * JUnit
     * @Test -> метод, тестовый сценарий
     *
     * @Before, @BeforeClass, @After, @AfterClass
     * тестовый класс + Test (например Vector2D -> Vector2DTest
     *
     * тестовые методы желательно должны содержать "should"  в названии (sum -> sumShouldBePositive)
     *
     * все тестовые методы должны быть public void
     * Аннотация @Test может использовать параметры expected (генерация исключения  и timeout - ожидаемое время работы
     * (не более)
     *
     * JUnit - class Assert
     *
     * static method from Assert
     * assertTrue()
     * assertFalse()
     * assertEquals()
     * assertArrayEquals()
     * assertNoEquals()
     * assertSame()
     * assertNotSame()
     * Assert.fail - гарантированное падение теста
     *
     * Assume.assumeFalse,
     * Assume.assumeEquals
     * Если проверка верна - тест пройдет, иначе тест игнорируется
     *
     *
     * */
}
