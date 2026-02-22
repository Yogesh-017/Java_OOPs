package OOPS.OOPs_Self.Project_College;

public class Student extends Person
        implements Gradeable, Comparable<Student> {
    private int marks;
    private static int StudentCount = 0;

    Student(String name, int age, int marks) throws InvalidMarksException {
        super(name, age);
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("you entered invalid marks");
        }
        this.marks = marks;
        StudentCount++;

    }

    public int getMarks() {
        return marks;
    }

    public static int getStudentCount() {
        return StudentCount;

    }

    public String getGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public boolean isPassed() {
        if (marks >= 50) {
            return true;
        }
        return false;
    }

    public int compareTo(Student other) {
        return (this.marks - other.marks);
    }

    public void displayInfo() {

        System.out.println(
                "Student : " + getName() + " | age:" + getAge() + " | marks: " + marks + " | Grade: " + getGrade());

    }

}
