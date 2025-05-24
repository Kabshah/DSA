import java.util.LinkedList;
import java.util.Scanner;
public class StudentsLL {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        students.add("Kabshah");
        students.add("Kaif");
        students.add("Aaima");
        students.add("Ayaan");
        students.add("Haider");
        students.add("Asiya");
        students.add("Sufiyan");
        students.add("Mawiya");
        students.add("Amal");
        students.add("Hareem");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View the list");
            System.out.println("2. Insert an element");
            System.out.println("3. Search an element");
            System.out.println("4. Delete a record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Student List: " + students);
                    break;
                case 2:
                    System.out.print("Enter the name to insert: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the position (0-based index): ");
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    if (position >= 0 && position <= students.size()) {
                        students.add(position, name);
                        System.out.println("Updated List: " + students);
                    } else {
                        System.out.println("Invalid position!");}
                    break;
                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = scanner.nextLine();
                    if (students.contains(searchName)) {
                        System.out.println(searchName + " is found at index: " + students.indexOf(searchName));
                    } else {
                        System.out.println(searchName + " is not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the name to delete: ");
                    String deleteName = scanner.nextLine();
                    if (students.remove(deleteName)) {
                        System.out.println(deleteName + " has been removed.");
                        System.out.println("Updated List: " + students);
                    } else {
                        System.out.println(deleteName + " is not in the list.");}
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");}}}}
/*1. Write a program that can store 10 records of students in a link list manner and apply the following operations on it.
a. View the list
b. Insert the elements in different locations of linked list and view it.
c. Search any element from the linked list
d. Delete record again view the list after deletion. */