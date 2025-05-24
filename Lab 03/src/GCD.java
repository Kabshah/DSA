import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a,b));}
    public static int gcd(int a, int b) {
        // Base case: If b is 0, return a
        if (b == 0) {return a;}
        // Recursive call with the second number and the remainder of a divided by b
        return gcd(b, a % b);}}