class Node {
    int data;Node next;
    Node(int data) {this.data = data;this.next = null;}}
public class LabTask4 {
    Node head;
    // Insert an integer at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;}
    public void displayList() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;}
        System.out.println("Displaying list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
            System.out.println();}}
    // Find the middle element of the list
    public void findMiddle() {
        Node slow = head;
        Node fast = head;
        if (head == null) {
            System.out.println("List is empty");
            return;}
        // Move fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;}
        System.out.println("Middle element is: " + slow.data);}
    public static void main(String[] args) {
        LabTask4 list = new LabTask4();
        list.insertAtBeginning(100);
        list.insertAtBeginning(200);
        list.insertAtBeginning(300);
        list.insertAtBeginning(400);
        list.insertAtBeginning(500);
        list.displayList();
        list.findMiddle();}}
/*4. You are managing a list of integers in a class, and you need to implement a Singly Linked List with the following operations:
a)	Insert an integer at the beginning of the list.
        b)	Display the list.
        c)	Find the middle element of the list. If the list has an even number of elements, return the first middle element.*/
