package com.pedrocoelho.sorting;

public class SelectionSort {

    public static void sort(int [] array) {

        if (array == null || array.length == 0) {
            return;
        }

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            int smallest = i;

            for (int current = i + 1; current < length; current ++) {
                if (array[current] < array[smallest]) {
                    smallest = current;
                }
            }

            int tempValue = array[smallest];
            array[smallest] = array[i];
            array[i] = tempValue;
        }
    }
}
