import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> sortedList = new ArrayList<>(Arrays.asList(5,7,15,16,19));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K(based on index): ");
        int k = sc.nextInt();
        // Check if k is within the valid range
        if (k > 0 && k <= sortedList.size()) {
            int kthSmallest = sortedList.get(k - 1); // k-1 because of zero-based indexing
            System.out.println("The " + k + "-th smallest element is: " + kthSmallest);
        } else {System.out.println("Invalid value of k: " + k);}}}
/*5. Find the k-th smallest element in a sorted ArrayList*/