import java.util.*;
class MergeBST {
    static class Node {
        int value;
        Node left, right;
        public Node(int item) {
            value = item;
            left = right = null;}}
    // Root node of the BST
    Node root;
    // Constructor to initialize the BST
    MergeBST() {
        root = null;}
    // Function to insert a new value in the BST
    void insert(int value) {
        root = insertRec(root, value);}
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
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);   // Visit left subtree
            System.out.print(root.value + " ");   // Visit node
            inorder(root.right);  }}// Visit right subtree
    // Function to perform inorder traversal and return the elements as a sorted list
    List<Integer> inorderList(Node root) {
        List<Integer> inorderList = new ArrayList<>();
        inorderListHelper(root, inorderList);
        return inorderList;}
    // Helper function to perform inorder traversal and store elements in the list
    private void inorderListHelper(Node root, List<Integer> inorderList) {
        if (root != null) {
            inorderListHelper(root.left, inorderList);
            inorderList.add(root.value);
            inorderListHelper(root.right, inorderList);}}
    // Function to merge two sorted lists into one sorted list
    List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        // Merge the lists while both lists have elements
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;}}
        // Add remaining elements of list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;}
        // Add remaining elements of list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;}
        return mergedList;}
    // Function to construct a balanced BST from a sorted list
    Node sortedListToBST(List<Integer> sortedList) {
        return sortedListToBSTHelper(sortedList, 0, sortedList.size() - 1);}
    // Helper function to construct a balanced BST
    private Node sortedListToBSTHelper(List<Integer> sortedList, int start, int end) {
        if (start > end) {
            return null;}
        // Find the middle element
        int mid = (start + end) / 2;
        Node node = new Node(sortedList.get(mid));
        // Recursively construct the left and right subtrees
        node.left = sortedListToBSTHelper(sortedList, start, mid - 1);
        node.right = sortedListToBSTHelper(sortedList, mid + 1, end);
        return node;}
    // Function to merge two BSTs and return a combined BST
    Node mergeBSTs(Node root1, Node root2) {
        List<Integer> list1 = inorderList(root1);
        List<Integer> list2 = inorderList(root2);
        // Merge the two sorted lists
        List<Integer> mergedList = mergeSortedLists(list1, list2);
        // Construct a balanced BST from the merged sorted list
        return sortedListToBST(mergedList);}
    public static void main(String[] args) {
        MergeBST tree1 = new MergeBST();
        MergeBST tree2 = new MergeBST();
        // Inserting values in the first BST
        tree1.insert(10);
        tree1.insert(5);
        tree1.insert(15);
        tree1.insert(3);
        tree1.insert(7);
        // Inserting values in the second BST
        tree2.insert(20);
        tree2.insert(25);
        tree2.insert(30);
        tree2.insert(17);
        tree2.insert(23);
        Node mergedRoot = tree1.mergeBSTs(tree1.root, tree2.root);
        System.out.println("Inorder traversal of the merged BST:");
        tree1.inorder(mergedRoot);}}