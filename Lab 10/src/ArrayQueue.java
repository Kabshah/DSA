public class ArrayQueue {
    private int[] queue;
    private int front,size,rear,capacity;
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;}
    // a) Enqueue: Add an element to the rear of the queue
    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");}
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = element;
        size++;}
    // b) Dequeue: Remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");}
        int element = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return element;}
    // c) Peek: Retrieve the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");}
        return queue[front];}
    // d) IsEmpty: Check if the queue is empty
    public boolean isEmpty() {return size == 0;}
    // e) IsFull: Check if the queue is full
    public boolean isFull() {return size == capacity;}
    // f) Size: Return the number of elements currently in the queue
    public int size() {return size;}
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Is queue full? " + queue.isFull());}}
/*2. In this problem, you need to implement a Queue in java ADT using an array. Your queue will support the following operations:
a)	Enqueue: Add an element to the rear of the queue.
        b)	Dequeue: Remove an element from the front of the queue.
        c)	Peek: Retrieve the front element of the queue without removing it.
d)	IsEmpty: Check if the queue is empty.
e)	IsFull: Check if the queue is full.
f)	Size: Return the number of elements currently in the queue.*/