import java.util.Scanner;
public class NewClass {
    public static int counter(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + counter(n / 10);}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(" Total digits in a number are: "+counter(num));}}
/*6 Write a program to count the digits of a given number using recursion.*/