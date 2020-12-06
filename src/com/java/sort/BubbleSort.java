package com.java.sort;

public class BubbleSort {
    public static int[] sort(int[] arr) {
        try {
            for(int i = 0; i< arr.length; i++) {
                for(int j=1; j< arr.length-i-1; j++) {
                    if(arr[j] < arr[j-1]) {
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.println("stage " + i);
                PrintArray.Print(arr);
            }
        } catch (Exception exc) {
            System.out.println(exc.getMessage() + " " + exc.getStackTrace());
        }
        return arr;
    }
}
