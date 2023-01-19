package Java_405_lessons.Patterns.Pattern_17_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPatterLesson {
    public static void main(String[] args) {
//        Reader reader = new MyReader();
//        reader.read("Hello ");
//
//        Reader reader1 = new ProxyReader();
//        reader1.read("Hello ");

        InvocationHandler invocationHandler = new ReaderInvocationHandler();
        Object proxyInstance = Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[] {Reader.class}, invocationHandler);
        ((Reader) proxyInstance).read("Hello !");

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

//Proxy -> do something before and after method
class ProxyReader extends MyReader {
    @Override
    public String read(String str) {
        System.out.println(str); // here could be logging
        String read = super.read(str);
        System.out.println(read);
        return null;
    }
}

//II
class ReaderInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(args[0]);
        Object result = method.invoke(new MyReader(), args);
        System.out.println(result);
        return result;
    }
}
