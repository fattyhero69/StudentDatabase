package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeyear;
    private String studentID;
    private String courses = "";
    private int balancebill = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    // Enter student name and year in constructor
    public Student() {
        // Read input from console
        Scanner in = new Scanner(System.in);
        System.out.println("What is student's first name? ");
        this.firstname = in.nextLine();

        System.out.println("What is student's last name? ");
        this.lastname = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nWhat year is student in? ");
        this.gradeyear = in.nextInt();
        // If gradeyear provided more than 4, then ask again for input.
        if (this.gradeyear > 4) {
            System.out.println("Invalid year, please answer correctly");
            this.gradeyear = in.nextInt();
        }

        setStudentID();

        // Testing
//        System.out.println(firstname + " " + lastname + " " + gradeyear + " " + studentID);

//          Moved to genID method
//        // After one student added, increment id by 1
//        id++;

    }

    // Generate an ID method
    private void setStudentID() {
        // Unique number with grade + ID
        id++;
        this.studentID = gradeyear + "" + id;
    }

    // Enroll
    public void enroll() {
        // Get inside loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
//                courses += course;
                courses = courses + "\n   " + course;
                balancebill += courseCost;
//                System.out.println("Before loop course value = " + courses);
            } else {
//                System.out.println("BREAK!"); // Testing for else statement
                break;
            }
        } while (1 != 0);

//        System.out.println("\nEnrolled in: " + courses);

    }

    // View tuition balance
    public void viewBalance() {
        System.out.println("\nYour balance for the term is: $" + balancebill);
    }

    // Pay tuition balance
    public void payBalance() {
        viewBalance();
        System.out.println("Enter amount to pay: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
//        System.out.println("What is your payment amount?:\n$" + payment);
        balancebill = balancebill - payment;
        if (balancebill == 0) {
            System.out.println("Full payment received. Thank you!");
        }
        if (balancebill < 0) {
            System.out.println("Very enthusiastic. We owe you: $" + Math.abs(balancebill));
        } else {
            System.out.println("Thank you for your payment.\nRemaining balance: $"
                    + balancebill);
        }
    }

    // Print student status
    public String showStatus() {
        return "\nName: " + firstname + " " + lastname +
                "\nGrade Year: " + gradeyear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + balancebill;
    }
}
