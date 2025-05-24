import java.util.Scanner;
class EmployeeManagementSystem {
    static class Node {
        int id;
        Node left, right;
        public Node(int id) {this.id = id;
            this.left = this.right = null;}}
    Node root;
    // Constructor to initialize the system
    public EmployeeManagementSystem() {
        root = null;}
    // a) Insert a new employee
    public void insert(int id) {
        root = insertRec(root, id);}
    private Node insertRec(Node root, int id) {
        if (root == null) {
            root = new Node(id);
            return root;}
        if (id < root.id) {
            root.left = insertRec(root.left, id);
        } else if (id > root.id) {
            root.right = insertRec(root.right, id);}
        return root;}
    // b) Search for an employee by ID
    public boolean search(int id) {
        return searchRec(root, id);}
    private boolean searchRec(Node root, int id) {
        if (root == null) {
            return false;}
        if (root.id == id) {
            return true;
        } else if (id < root.id) {
            return searchRec(root.left, id);
        } else {
            return searchRec(root.right, id);}}
    // c) Remove an employee
    public void remove(int id) {root = removeRec(root, id);}
    private Node removeRec(Node root, int id) {
        if (root == null) {return null;}
        if (id < root.id) {
            root.left = removeRec(root.left, id);
        } else if (id > root.id) {
            root.right = removeRec(root.right, id);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;}
            // Node with two children: get the inorder successor
            root.id = findMin(root.right).id;
            root.right = removeRec(root.right, root.id);}
        return root;}
    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;}
        return root;}
    // d) Display employees in sorted order
    public void displayInOrder() {
        System.out.print("Employees in sorted order: ");
        inOrderRec(root);
        System.out.println();}
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.id + " ");
            inOrderRec(root.right);}}
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Insert Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID to insert: ");
                    int idToInsert = scanner.nextInt();
                    ems.insert(idToInsert);
                    System.out.println("Employee inserted.");
                    break;
                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int idToSearch = scanner.nextInt();
                    if (ems.search(idToSearch)) {
                        System.out.println("Employee found.");
                    } else {
                        System.out.println("Employee not found.");}
                    break;
                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int idToRemove = scanner.nextInt();
                    ems.remove(idToRemove);
                    System.out.println("Employee removed if existed.");
                    break;
                case 4:
                    ems.displayInOrder();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");}}}}
/*Create a task for employee management system. In an employee management system, each employee is represented by an ID, and you need to maintain an efficient system that allows you to:
a)	Insert a new employee into the system.
b)	Search for an employee by their ID.
        c)	Remove an employee from the system.
d)	Display the employees in different sorted orders*/