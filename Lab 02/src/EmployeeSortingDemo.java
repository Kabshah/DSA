import java.util.*;// Step 1: Define the Employee class
class Employee implements Comparable<Employee> {
    // Attributes of the Employee class
    private int empId,yearOfJoining;
    private String empName,empGender;
    // Constructor to initialize Employee attributes
    public Employee(int empId, String empName, String empGender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;}
    // Getters for accessing employee attributes
    public int getYearOfJoining() {return yearOfJoining;}
    public String getEmpName() {return empName;}
    // Step 2: Implement the compareTo method to sort by year of joining
    public int compareTo(Employee other) {
        return Integer.compare(this.yearOfJoining, other.yearOfJoining);}
    // Override toString method for displaying employee details
    public String toString() {
        return "EmpId: " + empId + ", Name: " + empName + ", Gender: " + empGender + ", Year of Joining: " + yearOfJoining;}}
// Step 3: Create the main class to run the program
public class EmployeeSortingDemo {
    public static void main(String[] args) {
        // Step 4: Create an ArrayList to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "Female", 2020));
        employees.add(new Employee(2, "Bob", "Male", 2018));

        // Step 5: Sort employees by year of joining using Comparable
        Collections.sort(employees);
        System.out.println("Employees sorted by Year of Joining:");
        for (Employee emp : employees) {
            System.out.println(emp);}
        // Step 6: Sort employees by name using a Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpName().compareTo(emp2.getEmpName());}}); // Sort by name
        // Step 7: Display sorted employees by name
        System.out.println("\nEmployees sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);}}}
