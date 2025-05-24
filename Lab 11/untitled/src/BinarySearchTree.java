class BinarySearchTree {
    static class Node {
        int data;Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;}}
    Node root;
    public BinarySearchTree() {root = null;}
    public void insert(int data) {
        root = insertRec(root, data);}
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;}
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);}
        return root;}
    public void inorder() {inorderRec(root);}
    private void inorderRec(Node root) {
        if (root != null) {inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);}}
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] elements = {45, 15, 79, 90, 10, 55, 12, 20, 50};
        for (int element : elements) {
            tree.insert(element);}
        System.out.println("Inorder traversal of the binary search tree:");
        tree.inorder();}}