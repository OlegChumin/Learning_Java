package JavaMemoryLeak;

import java.util.ArrayList;
import java.util.List;

public class SolvedIssueWithMemoryLeak {
    static class LeakingObject {
        private byte[] largeArray = new byte[1024 * 1024]; // 1 MB
    }

    private static final int MAX_OBJECTS = 10; // Ограничение на количество объектов
    private static List<LeakingObject> leakingObjects = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            if (leakingObjects.size() >= MAX_OBJECTS) {
                // Удаляем старые объекты, когда их количество достигает максимального значения
                leakingObjects.remove(0);
            }
            leakingObjects.add(new LeakingObject());
            System.out.println("Leaking objects count: " + leakingObjects.size());
//            Thread.sleep(1000); // Sleep for 1 second before creating the next object
        }
    }
}
