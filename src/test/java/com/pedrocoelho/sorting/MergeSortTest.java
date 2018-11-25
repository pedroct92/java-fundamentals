package com.pedrocoelho.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testSort() {
        int array [] = {2, 4, 1, 3, 5};
        int expectedArray [] = {1, 2 , 3, 4, 5};
        MergeSort.sort(array);

        Assert.assertArrayEquals(expectedArray, array);
    }
}
