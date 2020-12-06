package com.java.sort;

public class Sort {
    public static void main(String[] args) {
        System.out.println("tugsuu");
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        PrintArray.Print(arr);
        System.out.println("");
        arr = BubbleSort.sort(arr);
        PrintArray.Print(arr);
    }
}
