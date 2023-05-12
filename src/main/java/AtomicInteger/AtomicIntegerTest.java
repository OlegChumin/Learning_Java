package AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger someInt = new AtomicInteger(0);

        int i = someInt.getAndAdd(10);
        int j = someInt.get();
        int k = someInt.addAndGet(10);

        System.out.println(i+" "+j+" "+k);
    }
}
