import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The factorial of "+ n+ " is: "+factorial(n));}
    public static int factorial(int n){
        if(n <= 0){return 1;}
        return n * factorial(n-1);}}
/*5. Write a recursive program to calculate the factorial of a given integer n */