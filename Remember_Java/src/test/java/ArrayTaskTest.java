import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import work_with_arrays.ArrayTask;

public class ArrayTaskTest {

    @Test
    void testSortAscending() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayTask.sortAscending(new int[]{4, 3, 2, 1}));
        System.out.println("testSortAscending passed");
    }

    @Test
    void testSortDescending() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayTask.sortDescending(new int[]{1, 2, 3, 4}));
        System.out.println("testSortDescending passed");
    }

    @Test
    void testMaxElement() {
        assertEquals(4, ArrayTask.maxElement(new int[]{1, 2, 3, 4}));
        System.out.println("testMaxElement passed");
    }

    @Test
    void testMinElement() {
        assertEquals(1, ArrayTask.minElement(new int[]{4, 3, 2, 1}));
        System.out.println("testMinElement passed");
    }

    @Test
    void testNegativeNumbers() {
        assertArrayEquals(new int[]{-4, -3}, ArrayTask.negativeNumbers(new int[]{4, -3, 2, -4}));
        System.out.println("testNegativeNumbers passed");
    }

    @Test
    void testEvenNumbers() {
        assertArrayEquals(new int[]{4, 2}, ArrayTask.evenNumbers(new int[]{4, 3, 2, 1}));
        System.out.println("testEvenNumbers passed");
    }

    @Test
    void testNumbersDivisibleByThree() {
        assertArrayEquals(new int[]{3}, ArrayTask.numbersDivisibleByThree(new int[]{4, 3, 2, 1}));
        System.out.println("testNumbersDivisibleByThree passed");
    }

    @Test
    void testSumArrayElements() {
        assertEquals(10, ArrayTask.sumArrayElements(new int[]{4, 3, 2, 1}));
        System.out.println("testSumArrayElements passed");
    }
}
