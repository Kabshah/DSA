class Student1 {
    int rollNumber;Student1 next;
    public Student1(int rollNumber) {
        this.rollNumber = rollNumber;this.next = null;}}
class SinglyLinkedList {
    Student1 head;  // Head of the list
    // Method to add a student roll number at the end of the list
    public void add(int rollNumber) {
        Student1 newStudent = new Student1(rollNumber);  // Create a new student node
        // If the list is empty, the new student becomes the head
        if (head == null) {
            head = newStudent;
        } else {
            // Traverse to the last node of the list
            Student1 current = head;
            while (current.next != null) {
                current = current.next;}
            // Append the new student at the end
            current.next = newStudent;}}
    // Method to delete a student by roll number
    public void delete(int rollNumber) {
        // If the list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;}
        // If the student to be deleted is the head
        if (head.rollNumber == rollNumber) {
            head = head.next;  // Move the head to the next student
            System.out.println("Student with roll number " + rollNumber + " deleted.");
            return;}
        // Traverse the list to find the student to delete
        Student1 current = head;
        while (current.next != null) {
            if (current.next.rollNumber == rollNumber) {
                current.next = current.next.next;  // Skip the student to delete
                System.out.println("Student with roll number " + rollNumber + " deleted.");
                return;}
            current = current.next;}
        // If the roll number is not found
        System.out.println("Student with roll number " + rollNumber + " not found.");}
    // Method to display the roll numbers of all students
    public void display() {
        // If the list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;}
        // Traverse the list and print each student's roll number
        Student1 current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber);
            current = current.next;}}}
public class HomeTask2 {
    public static void main(String[] args) {
        SinglyLinkedList studentList = new SinglyLinkedList();
        studentList.add(314);
        studentList.add(100);
        studentList.add(3);
        System.out.println("Student Roll Numbers:");
        studentList.display();
        studentList.delete(3);  // Delete the student with roll number 102
        System.out.println("\nUpdated Student Roll Numbers:");
        studentList.display();}}

/*2. You are tasked with managing a list of students' roll numbers in a class. Initially, the list is empty. You have to implement a Singly Linked List with the following operations:
a)	Add student roll number at the end of the list. b)	Delete a student by roll number.
c)	Display the roll numbers of all students in the class*/