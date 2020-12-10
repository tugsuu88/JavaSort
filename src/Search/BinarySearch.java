package Search;

public class BinarySearch {
    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length);
    }

    public static boolean binarySearchRecursive(int[] array, int x, int leftStart, int rightEnd) {
        if(leftStart >= rightEnd) {
            return false;
        }
        int middle = (leftStart + rightEnd)/2;
        if(x == array[middle]) {
            return true;
        }
        if(x < array[middle]) {
            return binarySearchRecursive(array, x, leftStart, middle);
        } else {
            return binarySearchRecursive(array, x, middle, rightEnd);
        }
    }
}
