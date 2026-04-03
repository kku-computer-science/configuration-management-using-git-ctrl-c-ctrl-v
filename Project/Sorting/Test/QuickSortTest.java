import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class QuickSortTest {

    @Test
    public void testGeneralCase() {
        int[] input = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        QuickSort.Sort(input); 
        Assertions.assertArrayEquals(expected, input, "QuickSort: General case failed");
    }

    @Test
    public void testReverseSorted() {
        int[] input = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        QuickSort.Sort(input);
        Assertions.assertArrayEquals(expected, input, "QuickSort: Reverse case failed");
    }

    @Test
    public void testWithDuplicates() {
        int[] input = { 5, 1, 5, 2, 1 };
        int[] expected = { 1, 1, 2, 5, 5 };
        QuickSort.Sort(input);
        Assertions.assertArrayEquals(expected, input, "QuickSort: Duplicate case failed");
    }
}