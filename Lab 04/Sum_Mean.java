import java.util.Scanner;
public class Sum_Mean {
    public static void main(String[] args) {
        double [] numbers = new double[7];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 7 numbers ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter "+(i+1) + ": ");
            numbers[i] = input.nextDouble();}
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];}
        double mean = sum / numbers.length;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The mean of the given numbers is "+mean);}}
/*1. Write a program that takes an array of Real numbers having size 7 and calculate the sum
and mean of all the elements. Also depict the memory management of this task. */