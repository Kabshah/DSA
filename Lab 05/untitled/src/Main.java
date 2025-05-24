import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = sc.nextInt();}
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;}
                System.out.println("Iteration of j" + (j + 1) + ":");
                printArray(arr);
            }
            System.out.print("Iteration " + (i + 1) + " of i: ");
            printArray(arr);}
        System.out.println("Final sorted array:");
        printArray(arr);}// Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");}
        System.out.println();}}
/*2. Write a program that takes 10 numbers as input in an array. Sort the elements of array
by using Bubble sort. Print each iteration of the sorting process. */

