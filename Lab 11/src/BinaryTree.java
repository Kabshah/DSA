class BinaryTree {
    static class Node {
        int value;
        Node left, right;
        // Constructor to create a new node
        public Node(int item) {
            value = item;
            left = right = null;}}
    // Root node of the Binary Tree
    Node root;
    BinaryTree() {root = null;}
    // Function to insert a new value in the Binary Tree
    void insert(int value) {root = insertRec(root, value);}
    // A recursive function to insert a new value in the Binary Tree
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
        return root;}
    // Function to do inorder traversal of the Binary Tree
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);   // Visit left subtree
            System.out.print(root.value + " ");   // Visit node
            inorder(root.right);  }}// Visit right subtree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(10);
        tree.insert(55);
        tree.insert(12);
        tree.insert(20);
        tree.insert(50);
        System.out.println("Inorder traversal before inserting 60:");
        tree.inorder(tree.root);
        System.out.println();
        tree.insert(60);
        System.out.println("Inorder traversal after inserting 60:");
        tree.inorder(tree.root);}}
