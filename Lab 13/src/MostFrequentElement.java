import java.util.HashMap;
import java.util.Map;
public class MostFrequentElement {
    public static int findMostFrequent(int[] arr) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // Populate the HashMap with element frequencies
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);}
        int mostFrequent = Integer.MAX_VALUE; // Store the most frequent element
        int highestFrequency = 0; // Store the highest frequency
        // Iterate through the HashMap to find the most frequent element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > highestFrequency || (frequency == highestFrequency && num < mostFrequent)) {
                mostFrequent = num;
                highestFrequency = frequency;}}
        return mostFrequent;}
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 1, 3, 1};
        System.out.println("Most frequent element: " + findMostFrequent(arr));}}

//import java.util.HashMap;
//public class MostFrequentElement {
//    public static int findMostFrequent(int[] arr) {
//        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int num : arr) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);}
//        int mostFrequentElement = Integer.MAX_VALUE;
//        int highestFrequency = 0;
//        for (int key : frequencyMap.keySet()) {
//            int frequency = frequencyMap.get(key);
//            if (frequency > highestFrequency || (frequency == highestFrequency && key < mostFrequentElement)) {
//                mostFrequentElement = key;
//                highestFrequency = frequency;}}
//        return mostFrequentElement;}
//    public static void main(String[] args) {
//        int[] arr = {99, 9, 39, 2, 9, 9, 0, 19, 90};
//        System.out.println("Most Frequent Element: " + findMostFrequent(arr));}}
/*3. Create a HashMap object called Vehicles which store String keys and String values
and perform add( ), remove( ) and search( ) methods on it.*/
