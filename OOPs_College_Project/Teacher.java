package OOPS.OOPs_Self.Project_College;

public class Teacher extends Person implements Payable, Comparable<Teacher> {
    private String Subject;
    private double baseSalary;
    private static int teacherCount = 0;

    Teacher(String name, int age, String Subject, double baseSalary) {
        super(name, age);
        this.Subject = Subject;
        this.baseSalary = baseSalary;
        teacherCount++;
    }

    public String getSubject() {
        return Subject;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    static int getTeacherCount() {
        return teacherCount;
    }

    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.2);
    }

    public void showPayslip() {
        System.out.println("Teacher: " + getName() + " | subject : " + getSubject() + " | salary: " + baseSalary);
    }

    @Override
    public int compareTo(Teacher other) {
        return Double.compare(this.baseSalary, other.baseSalary);
    }

    public void displayInfo() {
        System.out.println("Teacher: " + getName() + " | Age: " + getAge() + " Subject: " + Subject);
    }
}
