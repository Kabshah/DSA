class BSTInsertMultiple {
    static class Node {
        int value;
        Node left, right;
        // Constructor to create a new node
        public Node(int item) {
            value = item;
            left = right = null;}}
    // Root node of the BST
    Node root;
    // Constructor to initialize the BST
    BSTInsertMultiple() {root = null;}
    // Function to insert a new value in the BST
    void insert(int value) {root = insertRec(root, value);}
    // A recursive function to insert a new value in the BST
    Node insertRec(Node root, int value) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(value);
            return root;}
        // Otherwise, recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);}
        // return the (unchanged) node pointer
        return root;}
    // Function to do inorder traversal of the BST
    void inorder() {inorderRec(root);}
    // A recursive function for inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);   // Visit left subtree
            System.out.print(root.value + " ");   // Visit node
            inorderRec(root.right);}}
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        BSTInsertMultiple tree = new BSTInsertMultiple();
        // Taking multiple values as input to insert into the tree
        System.out.println("Enter multiple values to insert into the tree (separate by space):");
        String[] inputs = scanner.nextLine().split(" ");
        // Insert each value into the BST
        for (String input : inputs) {
            int value = Integer.parseInt(input); // No error handling for invalid input
            tree.insert(value);}
        System.out.println("Inorder traversal of the BST:");
        tree.inorder();}}
