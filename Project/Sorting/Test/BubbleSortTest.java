import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BubbleSortTest {

    @Test
    public void testGeneralCase() {
        int[] input = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        BubbleSort.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input, "BubbleSort: General case failed");
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = { -5, -1, -10, 0, 5 };
        int[] expected = { -10, -5, -1, 0, 5 };
        BubbleSort.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input, "BubbleSort: Negative case failed");
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        BubbleSort.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input, "BubbleSort: Empty array failed");
    }
}