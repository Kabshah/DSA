import java.util.Arrays;
public class MergeSortPrint {
    static void divide(int[] arr, int left, int right) {
        if (left >= right) {
            return;}
        int mid = (left + right) / 2;
        System.out.println("Dividing: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)) + " into " +
                Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) + " and " +
                Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));
        // Recursively divide the left and right halves
        divide(arr, left, mid);
        divide(arr, mid + 1, right);
        merge(arr, left, mid, right);}// Merge the sorted halves
    // Merge function to combine two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {
        int[] mix = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        System.out.println("Merging: " +
                Arrays.toString(Arrays.copyOfRange(arr, left, mid + 1)) + " and " +
                Arrays.toString(Arrays.copyOfRange(arr, mid + 1, right + 1)));
        // Merge elements into the `mix` array
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];}}
        // Copy remaining elements from the left half
        while (i <= mid) {
            mix[k++] = arr[i++];}
        while (j <= right) {// Merge the sorted halves
            mix[k++] = arr[j++];
        }// Copy merged array back to the original array
        for (int x = 0; x < mix.length; x++) {
            arr[left + x] = mix[x];}                   // print to show the result after merging
        System.out.println("Result after merging: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));}
    public static void main(String[] args) {
        int[] arr = {10, 7, 4, 6, 3, 2, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        divide(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));}}
/*3. Write a program that takes 10 random numbers in an array. Sort the elements of array
by using Merge sort applying recursive technique. Print each iteration of the sorting
process.*/