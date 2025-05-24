import java.util.*;
public class CounterK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer:");
        int input = sc.nextInt();
        printDescending(input);}
    public static int printDescending(int k){
        if(k<0){
            return k;}
        System.out.print(k + " ");
        return printDescending(k-1);}}
/*1. Write a program which takes an integer value (k) as input and prints the sequence of
numbers from k to 0 in descending order.*/