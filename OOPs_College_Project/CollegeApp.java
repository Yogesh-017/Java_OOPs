package OOPS.OOPs_Self.Project_College;

import java.util.*;

public class CollegeApp {
    public static void main(String args[]) {

        Student s1 = null, s2 = null, s3 = null;
        Teacher t1 = null, t2 = null;
        try {
            s1 = new Student("Yogesh", 20, 85);
            System.out.println(s1);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

        try {
            s2 = new Student("Tushar", 21, 92);
            System.out.println(s2);

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }

        try {
            s3 = new Student("Amit", 19, 45);
            System.out.println(s3);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        try {
            t1 = new Teacher("prof. sharma", 45, "Math", 50000);
            System.out.println(t1);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        try {
            t2 = new Teacher("prof. verma", 38, "Science", 60000);
            System.out.println(t2);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        t1.displayInfo();
        t2.displayInfo();

        System.out.println("the s1 grade is " + s1.getGrade());
        System.out.println("the s2 grade is " + s2.getGrade());
        System.out.println("the s3 grade is " + s3.getGrade());

        System.out.println("t1 salary is: " + t1.calculateSalary());
        System.out.println("t1 salary is: " + t2.calculateSalary());

        System.out.println("Total Students: " + Student.getStudentCount());
        System.out.println("Total Teacher: " + Teacher.getTeacherCount());

        Collections.sort(studentList);
        System.out.println("Sorted by marks: " + studentList);

        ArrayList<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(t1);
        TeacherList.add(t2);
        Collections.sort(TeacherList, (f1, f2) -> Double.compare(f2.getBaseSalary(), f1.getBaseSalary()));
        System.out.println(TeacherList);

        try {
            Student s4 = new Student("nitish", 20, 150);
            System.out.println(s4);
        } catch (Exception e) {
            System.out.println("invalid student" + e.getMessage());
        }
    }
}
