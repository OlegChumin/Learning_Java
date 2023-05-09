package SOLID._5_dependency_inversion.no_dip;

/**
 * D - Dependency Inversion Principle (DIP) - Принцип инверсии зависимостей:
 * Зависимости на конкретные модули должны быть заменены зависимостями на абстракции.
 * Верхние уровни модулей не должны зависеть от нижних уровней. Оба уровня должны зависеть от абстракций.
 *
 * */
// Нарушение DIP
public class MySQLDatabase {
    public void saveData(String data) { /*...*/ }
}