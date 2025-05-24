class BinaryTreeLCA {
    // Node class for the binary tree
    static class Node {
        int data;Node left, right;
        public Node(int data) {this.data = data;
            left = right = null;}}
    Node root;
    public BinaryTreeLCA() {root = null;}
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
            root.right = insertRec(root.right, data);
        }return root;}
    // Method to find the Lowest Common Ancestor (LCA)
    public Node findLCA(int n1, int n2) {
        return findLCARec(root, n1, n2);}
    // Recursive function to find the LCA
    private Node findLCARec(Node root, int n1, int n2) {
        if (root == null) {return null;}
        // If both n1 and n2 are smaller than root, LCA is in the left subtree
        if (n1 < root.data && n2 < root.data) {
            return findLCARec(root.left, n1, n2);}
        // If both n1 and n2 are greater than root, LCA is in the right subtree
        if (n1 > root.data && n2 > root.data) {
            return findLCARec(root.right, n1, n2);}
        // If one node is on the left and the other is on the right, root is the LCA
        return root;}
    public static void main(String[] args) {
        BinaryTreeLCA tree = new BinaryTreeLCA();
        int[] elements = {45, 15, 79, 90, 10, 55, 12, 20, 50};
        for (int element : elements) {tree.insert(element);}
        // Nodes to find the LCA of
        int n1 = 10, n2 = 20;
        // Find and display the LCA
        Node lca = tree.findLCA(n1, n2);
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {System.out.println("LCA not found.");}}}
/*4. Find the lowest common ancestor (LCA) of two nodes in a Binary Search Tree.*/