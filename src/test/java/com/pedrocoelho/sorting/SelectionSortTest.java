package com.pedrocoelho.sorting;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testSort() {
        int [] array = {99, 100, 9, 55, 66, 88, 2, 5};
        int [] expectedSortedArray = {2, 5, 9, 55, 66, 88, 99, 100};
        SelectionSort.sort(array);

        Assert.assertArrayEquals(expectedSortedArray, array);
    }

    @Test
    public void testSortWhenArrayIsAlreadySorted() {
        int [] array = {2, 5, 9, 55, 66, 88, 99, 100};
        int [] expectedSortedArray = {2, 5, 9, 55, 66, 88, 99, 100};
        SelectionSort.sort(array);

        Assert.assertArrayEquals(expectedSortedArray, array);
    }

    @Test
    public void testSortWhenArrayIsNull() {
        int [] array = null;
        int [] expectedSortedArray = null;
        SelectionSort.sort(array);

        Assert.assertArrayEquals(expectedSortedArray, array);
    }
}
