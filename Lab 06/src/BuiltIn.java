import java.util.Arrays;
public class BuiltIn {
    public static void main(String[] args) {
        int[] nos = {10, 20, 30, 40, 50};
        int key = 30;
        int index = Arrays.binarySearch(nos, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {System.out.println("Element " + key + " not found in the array.");}}}
/*2.	Write a program to search in array using Array built-in class.*/