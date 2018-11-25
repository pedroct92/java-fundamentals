package com.pedrocoelho.search;

public class BinarySearch {

    public static Boolean search(int [] array, int value) {

        if(array == null || array.length == 0) {
            return false;
        }

        int start = 0;
        int end = array.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(array[mid] == value) {
                return true;
            } else if (value < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
