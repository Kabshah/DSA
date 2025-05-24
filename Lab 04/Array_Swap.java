public class Array_Swap {
    public static void main(String[] args) {
        String [] arr1 = {"banana","apple","mango","orange"};
        String arr2[] = {"potato","tomato","onion","broocli"};
        for(int i=0; i<arr1.length; i++){
            String temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;}
        System.out.println("\t\" Swapped Array \"");
        System.out.print("Array 1 after swaping: ");
        printArr(arr1);
        System.out.println();
        System.out.print("Array 2 after swapping: ");
        printArr(arr2);}
    public static void printArr(String[] arr){
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+ " ");}}}
/*1 Write a program that takes two arrays of size 4 and swap the elements of those arrays. */