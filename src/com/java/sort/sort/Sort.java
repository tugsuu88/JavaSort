package com.java.sort.sort;

import Search.BinarySearch;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        System.out.println("tugsuu");
        int arr[] = {64, 34, 25, 12, 22, 90, 11, 13, 14};
        PrintArray.Print(arr);
        System.out.println("");
//        BubbleSort.sort(arr);
//        arr = SelectionSort.sort(arr);
//        InsertionSort.sort(arr);

//        MergeSort mergeSort = new MergeSort();
//        mergeSort.mergeSort(arr);
        Arrays.sort(arr);
        PrintArray.Print(arr);

        boolean isFound = BinarySearch.binarySearchRecursive(arr, 13);
        System.out.println("isFound: " + isFound);
    }
}
