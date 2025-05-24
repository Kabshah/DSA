import java.util.Stack;
public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            // Pop the top element from the original stack
            int current = stack.pop();
            // Move elements from tempStack back to stack if they are greater than current
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            // Push the current element into tempStack
            tempStack.push(current);}
        return tempStack; }// tempStack is now sorted in ascending order
    public static void main(String[] args) {
        // Create and populate the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(344);
        stack.push(30);
        stack.push(1);
        stack.push(900);
        stack.push(92);
        stack.push(2);
        System.out.println("Original Stack: " + stack);
        // Sort the stack
        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted Stack: " + sortedStack);}}