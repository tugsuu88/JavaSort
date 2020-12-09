package com.java.sort.sort;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        if(arr.length <= 0) return new int[0];
        int minIndex;

        for(int i = 0; i< arr.length; i++) {
            minIndex = i;
            for(int j=i; j< arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            PrintArray.Print(arr);
        }

        return arr;
    }
}
