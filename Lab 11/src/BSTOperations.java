import java.util.Scanner;
public class BSTOperations {
    static class Node {
        int value;
        Node left, right;
        public Node(int value) {
            this.value = value;
            left = right = null;}}
    // Root node of the Binary Search Tree
    Node root;
    // Constructor to initialize the BST
    BSTOperations() {root = null;}
    // Function to insert a new value in the BST
    void insert(int value) {root = insertRec(root, value);}
    // A recursive function to insert a new value in the BST
    Node insertRec(Node root, int value) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(value);
            return root;}
        // If the value already exists in the BST, do not insert it again
        if (value == root.value) {
            return root;} // value already exists, do nothing
        // Otherwise, recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }return root;}
    // Function to check if a node with a specific value exists in the BST
    boolean find(int value) {return findRec(root, value);}
    // A recursive function to search for a value in the BST
    boolean findRec(Node root, int value) {
        // Base case: If the root is null, the value does not exist
        if (root == null) {return false;}
        // If the value is found
        if (value == root.value) {return true;}
        // Recur to the left or right subtree
        if (value < root.value) {
            return findRec(root.left, value);
        } else {
            return findRec(root.right, value);}}
    // Function to perform inorder traversal of the BST
    void inorder() {inorderRec(root);}
    // A recursive function to do inorder traversal of the BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);   // Visit left subtree
            System.out.print(root.value + " ");   // Visit node
            inorderRec(root.right);  }}// Visit right subtree
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BSTOperations tree = new BSTOperations();
        System.out.println("Enter the number of operations to perform:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input
        // Process each operation
        for (int i = 0; i < n; i++) {
            System.out.println("Enter operation (INSERT X, FIND X, or INORDER):");
            String operation = scanner.nextLine();
            if (operation.startsWith("INSERT")) {
                // Extract the value after "INSERT"
                String[] parts = operation.split(" ");
                int value = Integer.parseInt(parts[1]);
                tree.insert(value);}
            else if (operation.startsWith("FIND")) {
                // Extract the value after "FIND"
                String[] parts = operation.split(" ");
                int value = Integer.parseInt(parts[1]);
                if (tree.find(value)) {
                    System.out.println("Found " + value);
                } else {
                    System.out.println("Not Found " + value);}}
            else if (operation.equals("INORDER")) {
                // Perform inorder traversal and print values
                System.out.print("Inorder Traversal: ");
                tree.inorder();
                System.out.println();}// To move to the next line after inorder traversal
            else {System.out.println("Invalid operation");}}}}