package Part_07_Streams.Part_64;

import java.util.ArrayList;
import java.util.List;

/** Parallel stream vs sequential  */
public class ParallelStreams {
    public static void main(String[] args) {
        // 1 2 3 4  ... 1_000_000
        //to calculate it's element sum
        final int RANGE_NUMBER =  1_000_000;
        List<Integer> arrayList = new ArrayList<>(RANGE_NUMBER);
        for (int i = 1; i <= RANGE_NUMBER; i++) {
            arrayList.add(i);
        }
//        System.out.println(arrayList);
        Integer result = arrayList.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result);

        //Processor1           1.... 250_000 -> Result1
        //Processor2 250_000.... 500_000 -> Result1
        //Processor3 500_000.... 750_000 -> Result1
        //Processor4 750_000.... 1_000_000 -> Result1
        //Result = Result1 * Result2 * Result3 * Result4 -> work faster, but will not work with division and minus

        int startTime = (int) System.currentTimeMillis();
        long sumResult = arrayList.stream().reduce((acc, el) -> acc + el).get();
        int endTime = (int) System.currentTimeMillis();
        System.out.println(sumResult + " " + (endTime - startTime));
        int startTime2 = (int) System.currentTimeMillis();
        long sumParalletResult = arrayList.parallelStream().reduce((acc, el) -> acc + el).get();
        int endTime2 = (int) System.currentTimeMillis();
        System.out.println(sumParalletResult + " " + (endTime2 - startTime));
    }
}
