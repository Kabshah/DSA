import java.util.*;
class TicketQueue {
    private static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter commands (e.g., 'ENQUEUE <ticket_number>', 'PROCESS <k>', 'SIZE'). Type 'EXIT' to finish.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("EXIT")) {
                break;}
            String[] parts = input.split(" ");
            String command = parts[0].toUpperCase();
            switch (command) {
                case "ENQUEUE":
                    if (parts.length != 2) {
                        System.out.println("Invalid input. Use 'ENQUEUE <ticket_number>'.");
                        continue;}
                    try {
                        int ticketNumber = Integer.parseInt(parts[1]);
                        enqueue(ticketNumber);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ticket number. Please enter a valid integer.");}
                    break;
                case "PROCESS":
                    if (parts.length != 2) {
                        System.out.println("Invalid input. Use 'PROCESS <k>'.");
                        continue;}
                    try {
                        int k = Integer.parseInt(parts[1]);
                        process(k);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid value for k. Please enter a valid integer.");}
                    break;
                case "SIZE":
                    size();
                    break;
                default:
                    System.out.println("Invalid command. Use 'ENQUEUE', 'PROCESS', or 'SIZE'.");}}}
    private static void enqueue(int ticketNumber) {
        queue.add(ticketNumber);
        System.out.println("Ticket " + ticketNumber + " added to the queue.");}
    private static void process(int k) {
        boolean found = false;
        Queue<Integer> tempQueue = new LinkedList<>();
        while (!queue.isEmpty()) {
            int currentTicket = queue.poll();
            if (!found && currentTicket % k == 0) {
                System.out.println("Processing ticket " + currentTicket + ".");
                found = true;
            } else {tempQueue.add(currentTicket);}}
        if (!found) {System.out.println("No person to process.");}
        queue = tempQueue;}
    private static void size() {System.out.println("Number of people in the queue: " + queue.size());}}