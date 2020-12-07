package com.java.sort;

public class Sort {
    public static void main(String[] args) {
        System.out.println("tugsuu");
        int arr[] = {64, 34, 25, 12, 22, 90, 11};
        PrintArray.Print(arr);
        System.out.println("");
//        BubbleSort.sort(arr);
        arr = SelectionSort.sort(arr);
        PrintArray.Print(arr);
    }
}
