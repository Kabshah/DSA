public class MergeAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};int[] array2 = {3, 4, 5, 6, 7};
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            mergedArray[index++] = array1[i];}
        for (int i = 0; i < array2.length; i++) {
            mergedArray[index++] = array2[i];}
        // Step 2: Remove duplicates by copying unique elements into a new array
        int[] tempArray = new int[mergedArray.length];
        int uniqueCount = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            boolean isDuplicate = false;
            // Check if mergedArray[i] is already in tempArray
            for (int j = 0; j < uniqueCount; j++) {
                if (mergedArray[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;}}
            // If not a duplicate, add to tempArray
            if (!isDuplicate) {
                tempArray[uniqueCount++] = mergedArray[i];}
        }
        // Step 3: Create final array with the exact size of unique elements
        int[] finalArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalArray[i] = tempArray[i];}
        System.out.print("Merged array without duplicates: ");
        for (int num : finalArray) {
            System.out.print(num + " ");}}}
/*5. Given two integer arrays, merge them and remove any duplicate values from the resulting
array. */