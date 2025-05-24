public class Add_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array, array.length);
        System.out.println("Sum of array elements: " + sum);}
    public static int calculateSum(int[] array, int n) {
        // Base case: if the array size is 0, return 0
        if (n <= 0) {return 0;}
        // sum of the first (n-1) elements + last element
        return calculateSum(array, n - 1) + array[n - 1];}}
/* 4. Write a recursive program to calculate the sum of elements in an array.*/