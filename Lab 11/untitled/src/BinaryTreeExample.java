import java.util.Scanner;
class BinaryTreeExample {
    // Node class for the binary tree
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {this.data = data;
            left = right = null;}}
    Node root;
    public BinaryTreeExample() {
        root = null;}
    // Method to insert a node into the tree
    public void insert(int data) {
        root = insertRec(root, data);}
    // Recursive function to insert a node
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;}
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);}
        return root;}
    // Method to delete a node from the tree
    public void delete(int data) {
        root = deleteRec(root, data);}
    // Recursive function to delete a node
    private Node deleteRec(Node root, int data) {
        if (root == null) {return null;}
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node with one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;}
            // Node with two children: Get the inorder successor
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);}
        return root;}
    // Find the minimum value in the tree
    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;}
        return min;}
    // Method to search for a node
    public boolean search(int data) {
        return searchRec(root, data);}
    // Recursive function to search for a node
    private boolean searchRec(Node root, int data) {
        if (root == null) {return false;}
        if (data < root.data) {
            return searchRec(root.left, data);
        } else if (data > root.data) {
            return searchRec(root.right, data);
        }return true; }
    public void inorder() {inorderRec(root);}
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);}}
    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();
        int[] elements = {45, 15, 79, 90, 10, 55, 12, 20, 50};
        for (int element : elements) {tree.insert(element);}
        System.out.println("Initial tree (inorder traversal):");
        tree.inorder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter an item to search: ");
        int item = scanner.nextInt();
        if (tree.search(item)) {
            System.out.println(item + " is found in the tree. Deleting it...");
            tree.delete(item);
        } else {
            System.out.println(item + " is not found in the tree. Inserting it...");
            tree.insert(item);}
        System.out.println("\nUpdated tree (inorder traversal):");
        tree.inorder();}}
/*2. Write a program that takes an item input to search if there is an item present, deletes it otherwise insert it in a tree. */