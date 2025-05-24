import java.util.Scanner;
public class EvenOddDigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer number = sc.nextInt();  // Autoboxing from int to Integer
        int evenCounter = 0;
        int oddCounter = 0;
        while(number != 0){
            int digit = number % 10; // Unboxing from Integer to int&taking last digit of
            if(digit % 2 == 0){
                evenCounter++;
            } else{
                oddCounter++;}
            number = number/10; }// Move to next digit
        System.out.println("Number of even digits: " + evenCounter);
        System.out.println("Number of odd digits: " + oddCounter);}}
/* Write a Java program to count the number of even and odd digits in a given integer using
Autoboxing and Unboxing.*/