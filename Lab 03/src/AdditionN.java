import java.util.Scanner;
public class AdditionN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        System.out.print("The sum of number is: "+ sum(input));}
    public static int sum(int N) {
        if(N == 0){
            return N;}
        return N+sum(N-1);}}
/* 3. Write a program to calculate the sum of numbers from 1 to N using recursion. N should be user input. */