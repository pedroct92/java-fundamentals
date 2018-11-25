package com.pedrocoelho.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testSearchShouldReturnTrueForTheValue100() {
        int [] array = {1, 5, 6, 10, 99, 100, 200};
        int valueToBeFind = 200;

        Boolean found = BinarySearch.search(array, valueToBeFind);

        Assert.assertTrue(found);
    }

    @Test
    public void testSearchShouldReturnFalseForTheValue900() {
        int [] array = {1, 5, 6, 10, 99, 100, 200};
        int valueToBeFind = 900;

        Boolean found = BinarySearch.search(array, valueToBeFind);

        Assert.assertFalse(found);
    }
}
