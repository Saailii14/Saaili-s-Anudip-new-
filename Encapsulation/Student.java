package Encapsulation;
// Encapsulation Example: Student

public class Student {
    // Private data members
    private String studentName;
    private int marks;

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    // Method to add extra marks
    public void addBonusMarks(int bonus) {
        if (bonus > 0 && (marks + bonus) <= 100) {
            marks += bonus;
        }
    }

    // Method to deduct marks (like penalty)
    public void deductMarks(int penalty) {
        if (penalty > 0 && (marks - penalty) >= 0) {
            marks -= penalty;
        }
    }
}

// Main class to use the Student class
class Main {
    public static void main(String[] args) {
        Student student = new Student(); // Object creation

        student.setStudentName("Saaili");
        student.setMarks(80); // Initial marks

        student.addBonusMarks(10);    // Add 10 marks
        student.deductMarks(5);       // Deduct 5 marks

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Final Marks: " + student.getMarks());
    }
}


