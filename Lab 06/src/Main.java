public class Main {
    public static void occurrences(int[] A) {
        boolean[] visited = new boolean[A.length]; // track visited elements
        for (int i = 0; i < A.length; i++) {
            if (visited[i]) {continue;} // Skip already processed elements
            int count = 1; // Count the current element
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                    visited[j] = true; }}// Mark duplicates as visited
                System.out.print(A[i] + " " + count);
                if (i < A.length - 1) {System.out.print("; "); }}}
        public static void main(String[] args) {
            int[] A = {28, 1, 0, 1, 0, 3, 4, 0, 0, 3};occurrences(A);}}
/*2.	Write a function called occurrences that, given an array of numbers A, prints all the distinct values in
A each followed by its number of occurrences.
For example, if A = (28, 1, 0, 1, 0, 3, 4, 0, 0, 3),
the function should output the following five lines (here separated by a semicolon) “28 1; 1 2; 0 4; 3 2; 4 1”.*/