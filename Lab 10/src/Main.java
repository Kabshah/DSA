import java.util.*;
class Main {
    private static final int MAX_CAPACITY = 5; // Maximum capacity of the garage
    private static Map<String, Integer> carMovements = new HashMap<>(); // Tracks car movements
    private static Deque<String> garage = new ArrayDeque<>(); // Represents the garage
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car arrivals and departures (e.g., 'A ABC123' or 'D ABC123'). Type 'END' to finish.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;}
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter in the format 'A <license>' or 'D <license>'.");
                continue;}
            String action = parts[0];
            String licensePlate = parts[1];
            switch (action.toUpperCase()) {
                case "A":
                    handleArrival(licensePlate);
                    break;
                case "D":
                    handleDeparture(licensePlate);
                    break;
                default:
                    System.out.println("Invalid action. Use 'A' for arrival and 'D' for departure.");}}}
    private static void handleArrival(String licensePlate) {
        System.out.println("Car " + licensePlate + " arrives.");
        if (garage.size() < MAX_CAPACITY) {
            garage.addLast(licensePlate);
            carMovements.put(licensePlate, 0);
            System.out.println("Car " + licensePlate + " enters the garage.");
        } else {
            System.out.println("No room for car " + licensePlate + ". The car leaves.");}}
    private static void handleDeparture(String licensePlate) {
        System.out.println("Car " + licensePlate + " departs.");
        if (!garage.contains(licensePlate)) {
            System.out.println("Car " + licensePlate + " is not in the garage.");
            return;}
        Deque<String> tempQueue = new ArrayDeque<>();
        while (!garage.isEmpty() && !garage.peekFirst().equals(licensePlate)) {
            String movedCar = garage.removeFirst();
            tempQueue.addLast(movedCar);
            carMovements.put(movedCar, carMovements.get(movedCar) + 1);}
        // Remove the departing car
        if (!garage.isEmpty()) {
            garage.removeFirst();}
        // Restore the remaining cars back to the garage
        while (!tempQueue.isEmpty()) {
            garage.addFirst(tempQueue.removeLast());}
        System.out.println("Car " + licensePlate + " was moved out " + carMovements.get(licensePlate) + " times to allow others to depart.");}}