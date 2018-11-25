package com.pedrocoelho.sorting;

public class MergeSort {

    public static void sort(int [] array) {
        int [] tempArray = new int[array.length];
        sort(array, tempArray, 0, array.length - 1);
    }

    private static void sort(int [] array, int [] tempArray, int leftStart, int rightStart) {

        if (leftStart >= rightStart) {
            return;
        }

        int middle = (leftStart + rightStart) / 2;

        sort(array, tempArray, leftStart, middle);
        sort(array, tempArray, middle + 1, rightStart);
        mergeHalves(array, tempArray, leftStart, rightStart);
    }

    private static void mergeHalves(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int leftIndex = leftStart;
        int rightIndex = rightStart;
        int indexArray = leftStart;

        while (leftIndex <= leftEnd && rightIndex <= rightEnd) {

            if(array[leftIndex] <= array[rightIndex]) {
                tempArray[indexArray] = array[leftIndex];
                leftIndex++;
            } else {
                tempArray[indexArray] = array[rightIndex];
                rightIndex++;
            }
            indexArray++;
        }

        System.arraycopy(array, leftIndex, tempArray, indexArray, leftEnd - leftIndex + 1);
        System.arraycopy(array, rightIndex, tempArray, indexArray, rightEnd - rightIndex + 1);
        System.arraycopy(tempArray, leftStart, array, leftStart, size);
    }
}
