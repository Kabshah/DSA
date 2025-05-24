import java.util.LinkedList;
import java.util.Queue;
public class queueStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public queueStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();}
    // Push element onto stack
    public void push(int x) {queue1.add(x);}
    // Pop element from stack
    public int pop() {
        if (queue1.isEmpty()) {
            return -1;} // Stack is empty
        // Move all but the last element from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());}
        // The last element is the top of the stack
        int top = queue1.poll();
        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;}
    // Get the top element of the stack
    public int peek() {
        if (queue1.isEmpty()) {
            return -1;} // Stack is empty
        // Move all but the last element from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());}
        // The last element is the top of the stack
        int top = queue1.peek();
        // Move the element back to queue1
        queue2.add(queue1.poll());
        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;}
    // Check if the stack is empty
    public boolean isEmpty() {return queue1.isEmpty();}
    public static void main(String[] args) {
        queueStack stack = new queueStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek()); }}