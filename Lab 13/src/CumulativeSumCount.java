import java.util.HashMap;
public class CumulativeSumCount {
    public static void countCumulativeSums(int[] arr) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int cumulativeSum = 0;
        for (int num : arr) {
            cumulativeSum += num;
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);}
        System.out.println("Cumulative Sum Frequencies:");
        for (int sum : sumMap.keySet()) {
            System.out.println("Sum: " + sum + " | Frequency: " + sumMap.get(sum));}}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, -1, 2};
        countCumulativeSums(arr);}}
/*5.Use a HashMap to store the cumulative sum of elements and count how often a sum has occurred.*/