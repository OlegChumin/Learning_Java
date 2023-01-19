package Java_405_lessons.Patterns.Pattern_17_Proxy;

public class ProxyPatterLesson {
    public static void main(String[] args) {
        Reader reader = new MyReader();
        reader.read("Hello ");
    }
}

interface Reader {
    String read(String str);
}

class MyReader implements Reader {

    @Override
    public String read(String str) {
        return str + "!";
    }
}
