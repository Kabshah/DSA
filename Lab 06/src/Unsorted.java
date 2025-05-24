import java.util.Arrays;
public class Unsorted {
    public static void main(String[] args) {
    int[] arr ={10,9,7,8,5,4,2,1,};
    System.out.println("Smallest element missing from the array is: "+smallestElement(arr));}
    static int smallestElement(int[] arr){
        Arrays.sort(arr);
        int start =0 ,end =arr.length-1;
        while(start<=end){
        int m = (start+end)/2;
        if(arr[m] == m+1){start = m+1;}
        else{end = m-1;}}
            return start+1;}}
/*3.	Given an unsorted array arr of integers, find the smallest positive integer that is missing from the array. You need to
implement this using binary search.The array can contain both negative numbers and positive numbers, and you can assume that
the array does not have duplicates.*/