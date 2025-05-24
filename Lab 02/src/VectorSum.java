import java.util.Vector;
public class VectorSum {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        int sum = 0;
        System.out.println("The integers in the Vector are:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum = sum +i;}
        System.out.println("\nThe sum of these integers is: " + sum); }}