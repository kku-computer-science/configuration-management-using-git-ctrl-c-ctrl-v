import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SortingAlgoTest {

    @Test
    public void testQuickSort_GeneralCase() {
        int[] input = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };

        QuickSort.Sort(input); 
        Assertions.assertArrayEquals(expected, input, "QuickSort: เรียงเลขทั่วไปผิดพลาด");
    }

    @Test
    public void testQuickSort_ReverseSorted() {
        int[] input = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };

        QuickSort.Sort(input);
        Assertions.assertArrayEquals(expected, input, "QuickSort: เรียงเลขจากมากไปน้อยผิดพลาด");
    }

    @Test
    public void testQuickSort_WithDuplicates() {
        int[] input = { 5, 1, 5, 2, 1 };
        int[] expected = { 1, 1, 2, 5, 5 };

        QuickSort.Sort(input);
        Assertions.assertArrayEquals(expected, input, "QuickSort: จัดการเลขซ้ำผิดพลาด");
    }

    @Test
    public void testBubbleSort_GeneralCase() {
        int[] input = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };

        BubbleSort.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input, "BubbleSort: เรียงเลขทั่วไปผิดพลาด");
    }

    @Test
    public void testBubbleSort_NegativeNumbers() {
        int[] input = { -5, -1, -10, 0, 5 };
        int[] expected = { -10, -5, -1, 0, 5 };

        BubbleSort.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input, "BubbleSort: จัดการเลขติดลบผิดพลาด");
    }

    @Test
    public void testBubbleSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        BubbleSort.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input, "BubbleSort: จัดการอาเรย์ว่างผิดพลาด");
    }
}
