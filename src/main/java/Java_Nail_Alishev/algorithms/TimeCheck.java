package Java_Nail_Alishev.algorithms;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

//import org.apache.commons.lang3.time.StopWatch;

public class TimeCheck {
    public static void main(String[] args) throws InterruptedException {
        timeCheckByDate(5000);
        timeCheckByInstant(5000);
        timeCheckByStopWatch(5000);
    }

    // определение скорости работы программы с помощью класса Date и метода getTime()
    static void timeCheckByDate(int delay) throws InterruptedException {
        long startTime, finishTime;
        Date date = new Date();
        startTime = date.getTime();
        Thread.sleep(delay);
        finishTime = date.getTime();
        System.out.println((finishTime - startTime) + "Время исполнения замеряно с помощью Date+getTime()");
    }

    // определение скорости работы программы с помощью класса Instant и Duration
    static void timeCheckByInstant(int delay) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(delay);
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() +
                "Время исполнения замеряно с помощью Instant и Duration");
    }

    // определение скорости работы программы с помощью StopWatch
    static void timeCheckByStopWatch(int delay) throws InterruptedException {
//        StopWatch stopWatch = new StopWatch();
        Thread.sleep(delay);
//        long startTime = System.currentTimeMillis();
//        long finishTime = System.currentTimeMillis();
//        System.out.println((finishTime - startTime) + "Время исполнения замеряно с помощью StopWatch");
    }
}
