import java.util.ArrayList;
import java.util.Collections;
class MergeBST {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {this.data = data;
            left = right = null;}}
    // Function to insert a node into a BST
    private static Node insert(Node root, int data) {
        if (root == null) {return new Node(data);}
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }return root;}
    // Function to perform in-order traversal and store elements in a list
    private static void inOrder(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);}}
    // Function to merge two BSTs into one
    public static Node mergeTrees(Node root1, Node root2) {
        ArrayList<Integer> nodes = new ArrayList<>();
        // Get in-order traversal of both trees
        inOrder(root1, nodes);
        inOrder(root2, nodes);
        // Sort the combined nodes
        Collections.sort(nodes);
        // Build a new BST from the sorted nodes
        return buildBST(nodes, 0, nodes.size() - 1);}
    // Helper function to build a balanced BST from a sorted list
    private static Node buildBST(ArrayList<Integer> nodes, int start, int end) {
        if (start > end) {return null;}
        int mid = (start + end) / 2;
        Node root = new Node(nodes.get(mid));
        root.left = buildBST(nodes, start, mid - 1);
        root.right = buildBST(nodes, mid + 1, end);
        return root;}
    // Function to print the BST in in-order
    public static void printTree(Node root) {
        if (root != null) {printTree(root.left);
            System.out.print(root.data + " ");
            printTree(root.right);}}
    public static void main(String[] args) {
        Node tree1 = null;
        Node tree2 = null;
        // First BST
        int[] elements1 = {10, 5, 20, 3, 7};
        for (int value : elements1) {
            tree1 = insert(tree1, value);}
        // Second BST
        int[] elements2 = {15, 12, 30, 25, 35};
        for (int value : elements2) {
            tree2 = insert(tree2, value);}
        // Merge the two BSTs
        Node mergedTree = mergeTrees(tree1, tree2);
        System.out.println("In-order traversal of the merged BST:");
        printTree(mergedTree);}}
/*1. Write a function called MergeBST write a solution in a way that ppl think its written by a fresh dev
that give a combine Binary search tree of two
different binary search trees according to rules of binary tree then print all nodes. */