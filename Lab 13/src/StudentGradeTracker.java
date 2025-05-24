import java.util.HashMap;
public class StudentGradeTracker {
    private HashMap<String, Integer> studentGrades;
    public StudentGradeTracker() {
        studentGrades = new HashMap<>();}
    public void addOrUpdateGrade(String studentName, int grade) {
        studentGrades.put(studentName, grade);}
    public Integer getGrade(String studentName) {
        return studentGrades.get(studentName);}
    public double calculateClassAverage() {
        if (studentGrades.isEmpty()) {return 0;}
        int totalGrades = 0;
        for (int grade : studentGrades.values()) {
            totalGrades += grade;}
        return (double) totalGrades / studentGrades.size();}
    public static void main(String[] args) {
        StudentGradeTracker tracker = new StudentGradeTracker();
        tracker.addOrUpdateGrade("Kabshah",24);
        tracker.addOrUpdateGrade("kaif",16);
        System.out.println("Kabshah grade:" +tracker.getGrade("Kabshah"));
        System.out.println("kaif grade:"+tracker.getGrade("kaif"));
        System.out.println("Class average grade: " + tracker.calculateClassAverage());
        tracker.addOrUpdateGrade("Fashad",30);
        System.out.println("New class average: " + tracker.calculateClassAverage()); }}
/*You are developing a system to track student grades. The system should store the grades for each student in a course and calculate the average grade. Use a HashMap where the key is the student name (string) and the value is their grade (integer). The system should be able to add new students, update existing students' grades, and calculate the class average.
Requirements:
a)	Implement methods to:
•	Add or update student grades.
•	Get the grade of a specific student.
•	Calculate and return the class average grade.
b)	Handle edge cases, such as when no students have been added yet. */