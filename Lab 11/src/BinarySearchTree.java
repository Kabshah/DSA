class BinarySearchTree {
    // Node class to represent each element in the tree
    static class Node {
        int value;
        Node left, right;
        public Node(int item) {
            value = item;
            left = right = null;}}
    Node root;
    BinarySearchTree() {root = null;}
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
        return root;}
    // Function to do inorder traversal of the BST
    void inorder() {inorderRec(root);}
    // A recursive function for inorder traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);}}
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(10);
        tree.insert(55);
        tree.insert(12);
        tree.insert(20);
        tree.insert(50);
        System.out.println("Inorder traversal of the BST:");
        tree.inorder();}}