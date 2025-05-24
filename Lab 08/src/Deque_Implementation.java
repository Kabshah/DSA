import java.util.LinkedList;
import java.util.Deque;
public class Deque_Implementation {
    public static void main(String[] args) {
        Deque<String> handler = new LinkedList<>();
        handler.addFirst("Kabshah");
        handler.addLast("Kashif");
        System.out.println("After adding first & last deque is: "+ handler);
        System.out.println("Size is: "+handler.size());
        handler.removeFirst();
        System.out.println("After removing first: "+handler);
        handler.removeLast();
        System.out.println("After removing last: "+handler);}}
/*2. Write a program to create LinkedList using Deque and apply any five methods of Deque interface.*/