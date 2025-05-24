import java.util.LinkedList;
class Task {
    String name;int priority;
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;}
    // Method to display task details
    public String toString() {return "Task(name='" + name + "', priority=" + priority + ")";}}
class TaskQueue {
    LinkedList<Task> queue;
    // Constructor to initialize the queue
    public TaskQueue() {queue = new LinkedList<>();}
    // Method to add task to the queue based on priority
    public void addTask(Task task) {
        if (queue.isEmpty()) {
            queue.add(task); // If the queue is empty, just add the task
        } else {
            // Add task in sahi position based on priority
            boolean added = false;
            for (int i = 0; i < queue.size(); i++) {
                if (task.priority > queue.get(i).priority) {
                    queue.add(i, task); // Insert the task at the correct position
                    added = true;
                    break;}}
            if (!added) {
                queue.add(task);}}} // If no higher priority task, add at the end
    // Method to process (dequeue) the task with highest priority
    public Task processTask() {
        if (!queue.isEmpty()) {
            return queue.poll(); }// Removes and returns the highest priority task
        return null; }// Return null if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();}}
public class Tasks {
    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();
        taskQueue.addTask(new Task("Task 1", 5));
        taskQueue.addTask(new Task("Task 2", 2));
        taskQueue.addTask(new Task("Task 3", 8));
        taskQueue.addTask(new Task("Task 4", 3));
        taskQueue.addTask(new Task("Task 5", 6));
        System.out.println("Processing tasks in order of priority:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.processTask();
            System.out.println(task);}}}
/*3. You are managing a queue of tasks to be processed by a machine. Each task is assigned a priority, and you must process
 them in order of priority, with higher priorities processed first.Implement a queue where tasks are added with a priority, and each
 time you process (dequeue) a task, you must remove the task with the highest priority*/