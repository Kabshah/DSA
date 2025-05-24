import java.util.Scanner;
class Person {
    String name;int age;double salary;
    Person link;
    Person(String name, int age, double salary) {
        this.name = name;this.age = age;this.salary = salary;
        this.link = null; }} // Initialize link to null
class LinkedList {
    Person head;
    // Insert person at the end of the list
    public void insertPerson(String name, int age, double salary) {
        Person newPerson = new Person(name, age, salary);
        if (head == null) {
            head = newPerson;
        } else {
            Person ptr = head;
            while (ptr.link != null) {
                ptr = ptr.link;}
            ptr.link = newPerson; }}      // View all persons in the list
    public void viewList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;}
        Person ptr = head;
        while (ptr != null) {
            System.out.println("Name: " + ptr.name + ", Age: " + ptr.age + ", Salary: " + ptr.salary);
            ptr = ptr.link; }} // Move to the next node using 'link'
    // Delete a person by name
    public void deletePerson(String name) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;}               // If the person to be deleted is the first person
        if (head.name.equals(name)) {
            head = head.link;  // Set head to the next node
            System.out.println(name + " has been deleted.");
            return;}
        Person ptr = head;  // Replacing 'current' with 'ptr'
        while (ptr.link != null) {  // Using 'link' instead of 'next'
            if (ptr.link.name.equals(name)) {
                ptr.link = ptr.link.link;  // Skip over the deleted node
                System.out.println(name + " has been deleted.");
                return;}
            ptr = ptr.link;}
        System.out.println("Person not found.");}}
public class Employees {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            // Insert the person into the list
            list.insertPerson(name, age, salary);}
        // View the list
        System.out.println("\nList of persons:");
        list.viewList();
        // Deleting a person from the list
        System.out.print("\nEnter the name of the person you want to delete: ");
        String deleteName = scanner.nextLine();
        list.deletePerson(deleteName);
        // View the list after deletion
        System.out.println("\nList of persons after deletion:");
        list.viewList();}}