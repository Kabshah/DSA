import java.util.*;
class Employee {
    int id;String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;}}
class EmployeeManagementSystem {
    // TreeMap to store employees with their IDs for efficient searching and sorting
    private Map<Integer, Employee> employees;
    public EmployeeManagementSystem() {employees = new TreeMap<>(); }
    // Method to insert a new employee into the system
    public void insertEmployee(int id, String name) {
        if (!employees.containsKey(id)) {
            employees.put(id, new Employee(id, name));
            System.out.println("Employee inserted: ID = " + id + ", Name = " + name);
        } else {
            System.out.println("Employee with ID " + id + " already exists.");}}
    // Method to search for an employee by their ID
    public void searchEmployee(int id) {
        Employee employee = employees.get(id);
        if (employee != null) {
            System.out.println("Employee found: ID = " + id + ", Name = " + employee.name);
        } else {
            System.out.println("Employee with ID " + id + " not found.");}}
    // Method to remove an employee from the system
    public void removeEmployee(int id) {
        if (employees.containsKey(id)) {
            employees.remove(id);
            System.out.println("Employee with ID " + id + " has been removed.");
        } else {
            System.out.println("Employee with ID " + id + " does not exist.");}}
    // Method to display employees in ascending order of their IDs
    public void displayEmployeesAscending() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;}
        System.out.println("Employees in ascending order of ID:");
        for (Employee employee : employees.values()) {
            System.out.println("ID = " + employee.id + ", Name = " + employee.name);}}}
public class EmployeeManagaementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Insert Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display Employees (Ascending Order)");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            switch (choice) {
                case 1:  // Insert Employee
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    ems.insertEmployee(id, name);
                    break;
                case 2:  // Search Employee by ID
                    System.out.print("Enter Employee ID to search: ");
                    id = scanner.nextInt();
                    ems.searchEmployee(id);
                    break;
                case 3:  // Remove Employee
                    System.out.print("Enter Employee ID to remove: ");
                    id = scanner.nextInt();
                    ems.removeEmployee(id);
                    break;
                case 4:  // Display
                    ems.displayEmployeesAscending();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");}}}}