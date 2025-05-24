import java.util.Vector;
public class VectorMax {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        int sum = 0;
        System.out.println("The integers in the Vector are:");
        for (int i = 1; i <= 10; i++) {
            numbers.add(i); // Add each integer to the Vector
            System.out.print(i + " ");
            sum += i;}
        System.out.println("\nThe sum of these integers is: " + sum);

        int maxElement = numbers.get(0); // Assume the first element is the max
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > maxElement) { // Update maxElement if a larger value is found
                maxElement = numbers.get(i);}}
        System.out.println("The maximum element in the Vector is: " + maxElement);}}