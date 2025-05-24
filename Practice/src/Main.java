class Employee{
    String name; String designation; String department;String companyName; Employee link;
public Employee(String name,String designation,String companyName,String department){
    this.name = name;
    this.designation=designation;
    this.companyName = companyName;
    this.department=department;
}}
class EmployeeList {
    Employee head;
    public void insertAtBeginning(String name, String designation, String companyName, String department) {
        Employee New = new Employee(name, designation, companyName, department);
        New.link = head;
        head = New;
    }
    public void insertInMiddle(String afterEmployee,String name,String designation,String companyName,String department){
        Employee New1 = new Employee(name,designation,department,companyName);
        Employee ptr =head;
        while (ptr !=null){
            if(ptr.name.equals(afterEmployee)){
                ptr.link =New1.link;
                ptr.link = New1;
                return;
            }
            ptr = ptr.link;
        }
    }
    public void insertAtEnd(String name,String designation,String companyName, String department){
        Employee New2 = new Employee(name, designation, companyName, department);
        Employee ptr= head;
        while(ptr.link != null){
            ptr = ptr.link;}
            ptr.link = New2;
    }
    public void search(String item){
        Employee ptr = head;
        while(ptr != null){
            if(ptr.name.equals(item)){
                System.out.println("Name: "+ptr.name+ " Designation: "+ptr.designation);
            }
            ptr=ptr.link;
        }
    }

    public void display(){
        Employee ptr = head;
        while (ptr != null) {
            System.out.println("Employee Name: " + ptr.name + " Designation: " + ptr.designation + " Company: " + ptr.companyName + " Department: " + ptr.department);
            ptr = ptr.link;
        }
    }
}
class Main {
    public static void main(String[] args) {
        EmployeeList handler = new EmployeeList();
        handler.insertAtBeginning("Kabshah","Manager","ABC","Sales");
        handler.insertInMiddle("Kabshah","Kaif", "Cleaner","ABC","Domestic Help");
        handler.insertAtEnd("Aaima","Designer" ,"ABC", "Creative");
        handler.display();
        handler.search("Kaif");
    }
}


