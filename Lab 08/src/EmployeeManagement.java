class Employee {
    String name;String designation;String department;
    String companyName;Employee link;
    public Employee(String name, String designation, String department, String companyName) {
        this.name = name;this.designation = designation;this.department = department;
        this.companyName = companyName;this.link = null;}}
class EmployeeList {
    Employee head; // Head of the linked list
    public void insertAtBeginning(String name, String designation, String department, String companyName) {
        Employee newEmployee = new Employee(name, designation, department, companyName);
        newEmployee.link = head;  // Point the new employee to the ptr head
        head = newEmployee;    }   // Update head to the new employee
    public void insertAtEnd(String name, String designation, String department, String companyName) {
        Employee newEmployee = new Employee(name, designation, department, companyName);
        if (head == null) {
            head = newEmployee;  // If the list is empty, the new employee becomes the head
        } else {
            Employee ptr = head;
            while (ptr.link != null) {
                ptr = ptr.link; } // Traverse to the end
            ptr.link = newEmployee; }} // Add the new employee at the end
    public void insertInMiddle(String afterEmployeeName, String name, String designation, String department, String companyName) {
        Employee newEmployee = new Employee(name, designation, department, companyName);
        Employee ptr = head;
        while (ptr != null && !ptr.name.equals(afterEmployeeName)) {
            ptr = ptr.link;}
        if (ptr != null) {
            newEmployee.link = ptr.link;  // Point new employee to the link of the ptr employee
            ptr.link = newEmployee;       // Link the ptr employee to the new employee
        } else {
            System.out.println("Employee with name " + afterEmployeeName + " not found.");}}
    public void searchByName(String name) {
        Employee ptr = head;
        while (ptr != null) {
            if (ptr.name.equals(name)) {
                System.out.println("Employee found: ");
                System.out.println("Name: " + ptr.name);
                System.out.println("Designation: " + ptr.designation);
                System.out.println("Department: " + ptr.department);
                System.out.println("Company: " + ptr.companyName);
                return;}
            ptr = ptr.link;}
        System.out.println("Employee with name " + name + " not found.");}
    public void display() {
        if (head == null) {
            System.out.println("No employees in the list.");
            return;}
        Employee ptr = head;
        while (ptr != null) {
            System.out.println("Name: " + ptr.name + ", Designation: " + ptr.designation +
                    ", Department: " + ptr.department + ", Company: " + ptr.companyName);
            ptr = ptr.link;}}}
public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        list.insertAtBeginning("Kabshah", "Manager", "Sales", "ABC Corp");
        list.insertInMiddle("Kabshah","Aaima", "Designer","creatives", "DEF Pvt");
        list.insertAtEnd("Kaif", "Developer", "IT", "XYZ Ltd");
        System.out.println("Employee Records:");
        list.display();
        System.out.println("\nSearching for Aaima:");
        list.searchByName("Aaima");
        System.out.println("\nSearching for David:");
        list.searchByName("David");}}
/*1. Write a program that can insert the records of employees in a link list. The record includes employee’s name, designation, department and company name.
The program should be able to insert the record as first, last and as middle node in the list and search any record.*/