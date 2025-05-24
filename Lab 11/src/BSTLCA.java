class BSTLCA {
    static class Node {
        int value;
        Node left, right;
        public Node(int item) {
            value = item;
            left = right = null;}}
    // Root node of the BST
    Node root;
    BSTLCA() {root = null;}
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
            root.right = insertRec(root.right, value);
        }return root;}
    // Function to find the LCA of two nodes in the BST
    Node findLCA(int n1, int n2) {
        return findLCARec(root, n1, n2);}
    // A recursive function to find LCA of n1 and n2
    Node findLCARec(Node root, int n1, int n2) {
        // Base case: if the tree is empty or root is null
        if (root == null) {return null;}
        // If both n1 and n2 are smaller than root, then LCA lies in left subtree
        if (root.value > n1 && root.value > n2) {
            return findLCARec(root.left, n1, n2);}
        // If both n1 and n2 are greater than root, then LCA lies in right subtree
        if (root.value < n1 && root.value < n2) {
            return findLCARec(root.right, n1, n2);}
        // If one of n1 or n2 is smaller and the other is greater, root is the LCA
        return root;}
    public static void main(String[] args) {
        BSTLCA tree = new BSTLCA();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);
        int n1 = 5, n2 = 15;
        Node lca = tree.findLCA(n1, n2);
        if (lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.value);
        } else {
            System.out.println("LCA not found.");}}}