import java.util.Scanner;
public class FibonacciMemoization {
    // Array to store previously computed Fibonacci numbers
    private static long[] memo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        // Initialize the memoization array with size N+1
        memo = new long[n + 1];
        // Compute the N-th Fibonacci number
        long result = fibonacci(n);
        System.out.println("The " + n + "-th term in the Fibonacci series is: " + result);}
    // Recursive method to compute Fibonacci using memoization
    public static long fibonacci(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        // Check if the value has already been computed
        if (memo[n] != 0) {
            return memo[n];}
        // Compute Fibonacci number and store it in memoization array
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];}}