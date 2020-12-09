package com.java.sort;

public class Sort {
    public static void main(String[] args) {
        System.out.println("tugsuu");
        int arr[] = {64, 34, 25, 12, 22, 90, 11, 13, 14};
        PrintArray.Print(arr);
        System.out.println("");
//        BubbleSort.sort(arr);
//        arr = SelectionSort.sort(arr);
//        InsertionSort.sort(arr);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        PrintArray.Print(arr);
    }
}
