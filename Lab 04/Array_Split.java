public class Array_Split {
    private String[] arr;
    public Array_Split(String[] arr) {this.arr = arr;}
    // Method to split the array from the index of a specified key
    public void splitArray(String key) {
        int keyIndex = -1;
        // Search for the key in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                keyIndex = i;
                break;}}
        // Check if the key was found
        if (keyIndex == -1) {
            System.out.println("Key not found in the array.");
            return;}
        // Create two new arrays to hold the split parts
        String[] part1 = new String[keyIndex];
        String[] part2 = new String[arr.length - keyIndex];
        // Fill part1 with elements before the key index
        for (int i = 0; i < keyIndex; i++) {
            part1[i] = arr[i];}
        // Fill part2 with elements from the key index onward
        for (int i = keyIndex; i < arr.length; i++) {
            part2[i - keyIndex] = arr[i];}
//        Print the splittted arr
        System.out.print("Part 1: ");
        for (String element : part1) {
            System.out.print(element + " ");}
        System.out.println();
        System.out.print("Part 2: ");
        for (String element : part2) {
            System.out.print(element + " ");}
        System.out.println();}
    public static void main(String[] args) {
        String[] arr = {"red", "yellow", "blue", "orange", "green", "purple"};
        Array_Split arraySplit = new Array_Split(arr);
        String key = "blue";
        arraySplit.splitArray(key);}}
/*2. Add a method in the same class that splits the existing array into two. The method should
search a key in array and if found splits the array from that index of the key.*/