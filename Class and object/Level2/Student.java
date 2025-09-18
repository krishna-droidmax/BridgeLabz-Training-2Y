public class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;
    
    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    // Method to display student details and grade
    public void displayStudentReport() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("------------------------");
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice Johnson", 101, 92.5);
        Student student2 = new Student("Bob Smith", 102, 78.0);
        Student student3 = new Student("Charlie Brown", 103, 55.5);
        
        // Displaying student reports
        student1.displayStudentReport();
        student2.displayStudentReport();
        student3.displayStudentReport();
    }
}