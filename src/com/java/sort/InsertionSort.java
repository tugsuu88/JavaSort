package com.java.sort;

public class InsertionSort {
    static void sort(int[] arr) {
        for(int i=1; i< arr.length; i++) {
            int indexDown = i;
            int val = arr[i];
            while(indexDown !=0 && val < arr[indexDown-1]) {
//                insertion(arr, indexDown-1, indexDown, arr[indexDown]);
                arr[indexDown] = arr[indexDown - 1];
                indexDown--;
            }
            arr[indexDown] = val;
        }
    }
    static void insertion(int[] arr, int startIndex, int endIndex, int endValue) {
        while(endIndex != startIndex) {
            arr[endIndex] = arr[endIndex - 1];
            endIndex--;
        }
        arr[startIndex] = endValue;
    }
}
