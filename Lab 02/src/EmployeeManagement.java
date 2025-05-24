import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
class StaffMember {
    private String name;
    private int id;
    // Constructor to initialize StaffMember object
    public StaffMember(String name, int id) {
        this.name = name;
        this.id = id;}
    // Getters for name and id
    public String getName() {
        return name;}
    public int getId() {
        return id;}
    // Override equals method to compare staff members based on name and id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Reference check
        if (obj == null || getClass() != obj.getClass()) return false; // Null and type check

        StaffMember other = (StaffMember) obj; // Cast to StaffMember
        return id == other.id && Objects.equals(name, other.name);} // Compare name and id
    // Override hashCode method to ensure it is consistent with equals
    @Override
    public int hashCode() {
        return Objects.hash(name, id);} // Generate hash code based on name and id
    // Override toString method for easy display of staff member details
    @Override
    public String toString() {
        return "StaffMember{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';}
}
// EmployeeManagement class to manage staff member records
public class EmployeeManagement {
    private HashSet<StaffMember> staffMembers; // HashSet to store staff members

    // Constructor to initialize the HashSet
    public EmployeeManagement() {
        staffMembers = new HashSet<>();}
    // Method to add a new staff member
    public void addStaffMember(String name, int id) {
        StaffMember newStaffMember = new StaffMember(name, id);
        if (staffMembers.add(newStaffMember)) {
            System.out.println("Staff member added successfully: " + newStaffMember);
        } else {
            System.out.println("Staff member already exists: " + newStaffMember);}}
    // Method to display all staff members
    public void displayStaffMembers() {
        if (staffMembers.isEmpty()) {
            System.out.println("No staff members found.");
        } else {
            System.out.println("Staff Member List:");
            for (StaffMember staffMember : staffMembers) {
                System.out.println(staffMember);}}
    }
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Staff Member");
            System.out.println("2. Display Staff Members");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter staff member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter staff member ID: ");
                    int id = scanner.nextInt();
                    management.addStaffMember(name, id);
                    break;
                case 2:
                    management.displayStaffMembers();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        scanner.close();}} // Close the scanner
