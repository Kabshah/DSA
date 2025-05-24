public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {System.out.println("Element " + target + " found at index " + result);}}
    public static int binarySearch(int[] arr, int target) {
        int leftmostindex = 0;
        int rightmostindex = arr.length - 1;
        while (leftmostindex <= rightmostindex) {
            int middleindex = (leftmostindex + rightmostindex) / 2;
            if (arr[middleindex] == target) {
                return middleindex;
            } else if (arr[middleindex] < target) {
                leftmostindex = middleindex + 1; // Search the right half
            } else {
                rightmostindex = middleindex - 1; }}// Search the left half
        return -1;}} // Target not found
/*5.You are given a sorted array arr[] and a target element target. Your task is to find the first occurrence of the target in the array using binary search. If the target is not found, return -1.*/