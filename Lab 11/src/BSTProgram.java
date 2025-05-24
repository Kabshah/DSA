import java.util.Scanner;
class BSTProgram {
    static class Node {
        int value;
        Node left, right;
        public Node(int item) {
            value = item;
            left = right = null;}}
    // Root node of the BST
    Node root;
    BSTProgram() {root = null;}
    void insert(int value) {
        root = insertRec(root, value);}
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
    // Function to delete a value from the BST
    void delete(int value) {
        root = deleteRec(root, value);}
    // A recursive function to delete a value in the BST
    Node deleteRec(Node root, int value) {
        // If the tree is empty
        if (root == null) {
            return root;}
        // Recur down the tree to find the node to be deleted
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node to be deleted found
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;}
            // Node with two children: get the inorder successor
            root.value = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);}
        return root;}
    // Function to find the minimum value in a given tree
    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;}
        return minValue;}
    // Function to search for a value in the BST
    boolean search(int value) {return searchRec(root, value);}
    // A recursive function to search a value in the BST
    boolean searchRec(Node root, int value) {
        if (root == null) {return false;}
        if (value == root.value) {return true;}
        return (value < root.value) ? searchRec(root.left, value) : searchRec(root.right, value);}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BSTProgram tree = new BSTProgram();
        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(10);
        tree.insert(55);
        tree.insert(12);
        tree.insert(20);
        tree.insert(50);
        System.out.print("Enter the item to search, delete or insert: ");
        int item = scanner.nextInt();
        if (tree.search(item)) {
            System.out.println("Item found! Deleting " + item + "...");
            tree.delete(item);
            System.out.println(item + " has been deleted.");
        } else {
            System.out.println("Item not found! Inserting " + item + "...");
            tree.insert(item);
            System.out.println(item + " has been inserted.");}}}