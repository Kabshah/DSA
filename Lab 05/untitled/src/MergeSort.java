import java.util.Arrays;
public class MergeSort {
    public static void conquer(int[] arr, int left, int mid, int right) {
        int merged[] = new int[right - left + 1];
        int idx1 = left;   int idx2 = mid + 1;    int x = 0;
        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];}}
        // Remaining elements in left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];}
        // Remaining elements in right half
        while (idx2 <= right) {
            merged[x++] = arr[idx2++];}
        // Copy merged array back to original array
        for (int i = 0, j = left; i < merged.length; i++, j++) {
            arr[j] = merged[i];}}
    public static void divide(int arr[], int left, int right) {
        if (left >= right) {return;}
        int mid = (left + right) / 2;
        divide(arr, left, mid);
        divide(arr, mid + 1, right);
        conquer(arr, left, mid, right);}
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 9, 2, 8};
        int n = arr.length;
        System.out.println("Original array: "+ Arrays.toString(arr));
        divide(arr, 0, n - 1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");}
        System.out.println();}}
/*2. Write a program which takes an unordered list of integers (or any other objects e.g. String),
you have to rearrange the list in their natural order using merge sort.*/