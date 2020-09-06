package first.tests;

import first.sorting.Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BubbleSortTests {
    private void _assertArrayIsSorted(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue(ascending
                ? array[i + 1] >= array[i]
                : array[i + 1] <= array[i]
            );
        }
    }

    @Test
    public void arrayIsSortedAscending() {
        int[] arr = { 3, 5, 1, 2, 4 };

        Sorting.bubbleSortAsc(arr);

        _assertArrayIsSorted(arr, true);
    }

    @Test
    public void arrayIsSortedDescending() {
        int[] arr = { 3, 5, 1, 2, 4 };

        Sorting.bubbleSortDesc(arr);

        _assertArrayIsSorted(arr, false);
    }

    @Test
    public void ascendantArraySortedDescending() {
        int[] arr = { 1, 2, 3, 4, 5 };

        Sorting.bubbleSortDesc(arr);

        _assertArrayIsSorted(arr, false);
    }

    @Test
    public void descendantArraySortedAscending() {
        int[] arr = { 5, 4, 3, 2, 1 };

        Sorting.bubbleSortAsc(arr);

        _assertArrayIsSorted(arr, true);
    }
}