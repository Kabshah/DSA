import java.util.Scanner;
public class Input_MSort { // Merge function to combine two sorted halves
    public static void conquer(int[] arr, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];
        int idx1 = left;  // Pointer for the left half
        int idx2 = mid + 1;  // Pointer for the right half
        int x = 0;  // Pointer for the merged array
        // Merge the two halves into the merged array
        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {merged[x++] = arr[idx2++];}}
        while (idx1 <= mid) { // Add remaining elements from the left half
            merged[x++] = arr[idx1++];}
        while (idx2 <= right) { // Add remaining elements from the right half
            merged[x++] = arr[idx2++];}
        // Copy merged elements back to the original array
        for (int i = 0, j = left; i < merged.length; i++, j++) {
            arr[j] = merged[i];}}
    public static void divide(int[] arr, int left, int right) {
        if (left >= right) {return;}
        int mid = (left + right) / 2;
        divide(arr, left, mid);  // Sort the left half
        divide(arr, mid + 1, right);  // Sort the right half
        conquer(arr, left, mid, right); } // Merge the sorted halves
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }// Sort the array using Merge Sort
        divide(arr, 0, n - 1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }System.out.println();}}
/*3. You are given an unordered list of integers or strings. Write a program to Take this list as
input. Sort it in natural order using Merge Sort. For integers, this means ascending order.
For strings, this means alphabetical order. Print the sorted list.*/