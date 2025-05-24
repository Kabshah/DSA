import java.util.*;
public class StringArrayListMenu {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(List.of("orange","mango","apple","banana"));
        stringList.add("water-melon");
        int choice;
        do {System.out.println("\nMenu:");
            System.out.println("1. Display all elements");
            System.out.println("2. Display the largest string");
            System.out.println("3. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: displayAllElements(stringList);
                    break;
                case 2: displayLargestString(stringList);
                    break;
                case 3: System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");}
            }while (choice != 3);}
//        jaisy hee choice 3 krdogy yeh scenario oper wala stop hojaiga
    // Method to display all elements in the ArrayList
    public static void displayAllElements(ArrayList<String> stringList) {
        System.out.println("Elements in the list:");
        for (String str : stringList) {
            System.out.println(str);}}
    public static void displayLargestString(ArrayList<String> stringList) {
        if (stringList.isEmpty()) {
            System.out.println("The list is empty.");
            return;}
        // Finding the largest string based on lexicographical order
        String largestString = Collections.max(stringList);
        System.out.println("The largest string is: " + largestString);}}
/*5. Find the k-th smallest element in a sorted ArrayList*/