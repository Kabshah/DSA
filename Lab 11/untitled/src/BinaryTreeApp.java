import java.util.Scanner;
class BinaryTreeApp {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {this.data = data;
            left = right = null;}}
    Node root;
    public BinaryTreeApp() {root = null;}
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
    // Inorder traversal of the tree
    public void inorder() {
        inorderRec(root);}
    // Recursive function for inorder traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);}}
    public static void main(String[] args) {
        BinaryTreeApp tree = new BinaryTreeApp();
        Scanner scanner = new Scanner(System.in);
        // Take multiple inputs from the user
        System.out.println("Enter the number of elements to insert into the tree:");
        int n = scanner.nextInt();
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);}
        System.out.println("In-order traversal of the tree:");
        tree.inorder();}}
/*3. Insert multiple values into the tree, and perform an in-order traversal to verify the values are inserted correctly.*/