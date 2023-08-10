package POXY;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldInvocationHandler implements InvocationHandler {
    public static final String HELLO_WORLD_MESSAGE = "Hello, World!";

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
        if ("toString".equals(method.getName())) {
            return HELLO_WORLD_MESSAGE;
        }
        return method.invoke(HELLO_WORLD_MESSAGE, args);
    }
}