import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers (enter -1 to finish):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) { // Use -1 as a signal to end input
                break;} // Exit loop if user enters -1
            numbers.add(input);} // Add number to the vector
        // Step 3: Check if vector is not empty before sorting and finding numbers
        if (!numbers.isEmpty()) {
            // Step 4: Sort the vector
            Collections.sort(numbers);
            int largest = numbers.lastElement();
            int smallest = numbers.firstElement();
            System.out.println("Sorted Numbers: " + numbers);
            System.out.println("Largest Number: " + largest);
            System.out.println("Smallest Number: " + smallest);
        } else {System.out.println("No numbers were entered.");}}}