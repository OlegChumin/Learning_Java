package Advanced_Java.Part_08.Annotations;

//https://habr.com/ru/company/otus/blog/655239/

import java.util.List;

/**
 Аннотация @SuppressWarnings используется для подавления предупреждений компилятора. Например, @SuppressWarnings
 ("unchecked") отключает предупреждения, связанные с "сырыми" типами (Raw Types).

 Аннотация @FunctionalInterface используется для указания того, что в интерфейсе не может быть более одного абстрактного
 метода. Если абстрактных методов будет больше одного, то компилятор выдаст ошибку. Функциональные интерфейсы появились
 в Java 8 для реализации лямбда-выражений и гарантии того, что в них не более одного абстрактного метода.

 @Inherited
 По умолчанию аннотация не наследуется от родительского класса к дочернему. Мета-аннотация @Inherited позволяет ей
 наследоваться:
 */
@MyAnnotation
public class AnnotationsLesson {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public AnnotationsLesson(@MyAnnotation String name) {
        this.name = name;
    }

    @MyAnnotation
    public String getName() {
        return name;
    }

    @MyAnnotation
    public void setName(@MyAnnotation String name) {
        this.name = name;
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
    }

    @Deprecated
    public static void someOldMethod() {
        System.out.println();
    }

    /**
     Аннотация @SuppressWarnings используется для подавления предупреждений компилятора. Например,
     @SuppressWarnings("unchecked") отключает  предупреждения, связанные с "сырыми" типами (Raw Types).
     public void testSuppressWarning() {
     Map testMap = new HashMap();
     testMap.put(1, "Item_1");
     testMap.put(2, "Item_2");
     testMap.put(3, "Item_3");
     }
     Если мы запустим компиляцию из командной строки с параметром -Xlint:unchecked, то получим следующее сообщение:
     javac -Xlint:unchecked ./com/reflectoring/SuppressWarningsDemo.java
     Warning:
     unchecked call to put(K,V) as a member of the raw type Map
     Чтобы этот код компилировался без предупреждений измените строку:
     Map testMap = new HashMap(); на Map<Integer, String> testMap = new HashMap<>();
     Если подобного легаси кода много, то вы вряд ли захотите вносить изменения, поскольку это влечет за собой много
     регрессионного тестирования. В этом случае к классу можно добавить аннотацию @SuppressWarning, чтобы логи не
     загромождались избыточными предупреждениями.
     @SuppressWarnings({"rawtypes", "unchecked"})
     public class SuppressWarningsDemo {
     ...
     } Теперь при компиляции предупреждений не будет.
     */
    @SuppressWarnings("unchecked") //Indicates that the named compiler warnings should be suppressed in the annotated element
    public static void someMethod() {
        System.out.println();
    }

    /**
     * Функциональность varargs позволяет создавать методы с переменным количеством аргументов. До Java 5 единственной
     * возможностью создания методов с необязательными параметрами было создание нескольких методов, каждый из которых
     * с разным количеством параметров. Varargs позволяет создать один метод с переменным количеством параметров с
     * помощью следующего синтаксиса:
     * // можно написать так:
     * void printStrings(String... stringList)
     *
     * // вместо этого мы делаем:
     * void printStrings(String string1, String string2)
     * Однако при использовании в аргументах метода обобщенных типов выдаются предупреждения.
     * Аннотация @SafeVarargs позволяет подавить их:
     * private void printStringVarargs(String... tests) {...}
     * private void printStringSafeVarargs(List<String>... testStringLists) {...}
     * Методы printString() и printStringVarargs() приводят к одинаковому результату. Но при компиляции для метода
     * printStringSafeVarargs() выдается предупреждение, поскольку в нем используются обобщенные типы:
     * Добавив аннотацию @SafeVarargs, мы можем избавиться от этого предупреждения:
     * @SafeVarargs
     * private void printStringSafeVarargs(List<String>... testStringLists) {...}
     */
    @SafeVarargs
    private final void printStringSafeVarargs(List<String>... testStringLists) {
        for (List<String> testStringList : testStringLists) {
            for (String testString : testStringList) {
                System.out.println(testString);
            }
        }
    }
    private void printString(String test1, String test2) {
        System.out.println(test1);
        System.out.println(test2);}

    private void printStringVarargs(String... tests) {
        for (String test : tests) {
            System.out.println(test);
        }
    }
}

class SomeClass {
    public static void main(String[] args) {
        AnnotationsLesson.someOldMethod(); //Deprecated
    }

}
