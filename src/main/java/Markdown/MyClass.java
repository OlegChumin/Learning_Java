package Markdown;

/**
 * See {@docRoot}/../docs/MyClass.md for documentation.
 */
public class MyClass {

    /**
     * See {@docRoot}/../docs/MyClass.md#public-void-myMethod for documentation.
     */
    public void myMethod() {
        // ...
    }
}
/**
 * В этом примере, ../docs/MyClass.md указывает на путь к файлу MyClass.md относительно каталога src. Также следует
 * отметить, что @docRoot в Javadoc ссылается на корневой каталог сгенерированных файлов Javadoc, а не на корневой
 * каталог вашего проекта. Но в данном случае мы просто показываем как указать на файлы в проекте.
 *
 * */