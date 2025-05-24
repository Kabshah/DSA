class Student {
    String name;int rollNumber;Student next;  // Link to the next node
    public Student(String name, int rollNumber) {
        this.name = name;this.rollNumber = rollNumber;this.next = null; }}
class Two_Singly { Student head;  // Head of the list
    // Method to add a student to the list (append at the end)
    public void add(String name, int rollNumber) {
        Student newStudent = new Student(name, rollNumber);
        // If the list is empty, make the new student the head
        if (head == null) {
            head = newStudent;
        } else {
            // Traverse the list to find the last node
            Student current = head;
            while (current.next != null) {
                current = current.next;}
            // Append the new student
            current.next = newStudent;}}
    // Method to append another list to this list
    public void appendList(Two_Singly anotherList) {
        if (head == null) {
            head = anotherList.head;  // If the list is empty, just take the second list's head
        } else {
            // Traverse to the last student in the current list
            Student current = head;
            while (current.next != null) {
                current = current.next;}
            //Append the second list
            current.next = anotherList.head;}}
    public int countStudents() {
        int count = 0;
        Student ptr = head;
        //Traverse the list and count the students
        while (ptr != null) {
            count++;
            ptr = ptr.next;}
        return count;}         // Method to display the list of students
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;}
        Student current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Roll Number: " + current.rollNumber);
            current = current.next;}}}
public class Two_SinglyLL {
    public static void main(String[] args){
        Two_Singly list1 = new Two_Singly();
        Two_Singly list2 = new Two_Singly();
        list1.add("Kabshah", 314);
        list1.add("Kashif", 102);
        list2.add("Kaif", 201);
        list2.add("Aaima", 202);
        list1.appendList(list2);
        System.out.println("Final List of Students:");
        list1.displayList();
        int totalStudents = list1.countStudents();
        System.out.println("\nTotal number of students in the final list: " + totalStudents);}}
/*3. You are managing two singly linked lists representing two groups of students. Your task is to:
a)	Append the second list to the first list (i.e., add all elements of the second list to the end of the first list).
b)	Count the number of students in the final list (i.e., the total number of nodes in the list).
c)	Display the final list after the append operation.*/
