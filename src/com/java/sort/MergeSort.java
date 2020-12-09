package com.java.sort;

public class MergeSort {
    public void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length -1);
    }

    public void mergeSort(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        if(leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd)/2;
        mergeSort(array, tempArray, leftStart, middle); // sortLeftSide
        mergeSort(array, tempArray, middle + 1, rightEnd); //sortRightSide
        mergeHalves(array, tempArray, leftStart, rightEnd);
    }

    public void mergeHalves(int [] array, int[] tempArray, int leftStart,int rightEnd) {
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd) {
            if(array[left] < array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, tempArray, index, leftEnd - left + 1);
        System.arraycopy(array, right, tempArray, index, rightEnd - right + 1);
        System.arraycopy(tempArray, leftStart, array, leftStart, size);
    }
}
