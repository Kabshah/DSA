import java.util.Scanner;
class TreeOperations {
    class Node { int data;
        Node left, right;
        public Node(int item) {data = item;
            left = right = null;}}
    Node root;
    public TreeOperations() {root = null;}

    // Method to insert a node in the BST
    public void insert(int value) {
        root = insertRec(root, value);}
    private Node insertRec(Node root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(value);
            return root;}
        // Otherwise, recur down the tree
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);}
        // Return the (unchanged) node pointer
        return root;}

    // Method to find if a value exists in the BST
    public boolean find(int value) {return findRec(root, value);}

    private boolean findRec(Node root, int value) {
        // Base cases: root is null or value is present at the root
        if (root == null) {return false;}
        if (root.data == value) {return true;}
        // Recur down the tree
        if (value < root.data) {
            return findRec(root.left, value);
        } else {
            return findRec(root.right, value);}}
    // Method for inorder traversal
    public void inorder() {inorderRec(root);}
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);}}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeOperations bst = new TreeOperations();
        while (true) {
            System.out.println("\nEnter operation:");
            String operation = sc.nextLine().trim();
            if (operation.startsWith("INSERT")) {
                // Insert operation
                int value = Integer.parseInt(operation.split(" ")[1]);
                bst.insert(value);
            } else if (operation.startsWith("FIND")) {
                // Find operation
                int value = Integer.parseInt(operation.split(" ")[1]);
                if (bst.find(value)) {
                    System.out.println("Found " + value);
                } else {
                    System.out.println(value + " not found");}
            } else if (operation.equals("INORDER")) {
                // Inorder traversal
                System.out.print("Inorder traversal: ");
                bst.inorder();
                System.out.println();
            } else {System.out.println("Invalid operation.");}}}}
/*3. You are given a sequence of operations to be performed on a Binary Search Tree (BST). The operations are:
a)	INSERT X: Insert a new node with the value X into the BST. If a node with the value X already exists, do not insert it again.
b)	FIND X: Check if the node with value X exists in the BST.
        c)	INORDER: Print all values in the BST in ascending order (inorder traversal).
Your task is to implement a program that will execute the given sequence of operations and output the results accordingly.*/
