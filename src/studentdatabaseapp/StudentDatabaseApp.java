package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//        // Execution of a single student / single object
//        Student stu1 = new Student();
//        stu1.enroll();
//        stu1.payBalance();
//        System.out.println(stu1.showStatus());

        // Number of students we want to add
        System.out.println("How many students are there?: ");
        // An array to store n students
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payBalance();
            System.out.println(students[n].showStatus());
        }

    }
}
