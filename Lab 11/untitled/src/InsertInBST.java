public class InsertInBST {
    static class Node {
        int data;Node left, right;
        public Node(int data) {this.data = data;
            left = right = null;}}
    // Function to insert a node into a BST
    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);}
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }return root;}
    // Function to print the BST in in-order
    public static void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.data + " ");
            printTree(root.right);}}
    public static void main(String[] args) {
        Node mergedTree = null;
        // Create the merged BST using the previous logic
        int[] mergedElements = {3, 5, 7, 10, 12, 15, 20, 25, 30, 35};
        for (int value : mergedElements) {
            mergedTree = insert(mergedTree, value);}
        System.out.println("In-order traversal of the BST before insertion:");
        printTree(mergedTree);
        System.out.println();
        // Insert the new element '60'
        System.out.println("Inserting 60 into the BST...");
        mergedTree = insert(mergedTree, 60);
        // Print the BST after insertion
        System.out.println("In-order traversal of the BST after insertion:");
        printTree(mergedTree);}}
/*2. Write a program to insert new element ‘60’ in the Binary tree created in above ques.2.*/