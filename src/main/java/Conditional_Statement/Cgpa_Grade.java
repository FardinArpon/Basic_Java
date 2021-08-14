
/* Write a program to calculate CGPA and find grade from 4 subjects
 (GPA will based upon your university)    */

package Conditional_Statement;

import java.util.Scanner;

public class Cgpa_Grade {

    // use if-else condition for mark range and grade calculation

    static String grade;
    static double to_gpa(double mark) {
        if (mark >= 80) {
            grade = "A+";
            return 4.00;
        } else if (mark >= 75) {
            grade = "A";
            return 3.75;
        } else if (mark >= 70) {
            grade = "A-";
            return 3.50;
        } else if (mark >= 65) {
            grade = "B+";
            return 3.25;
        } else if (mark >= 60) {
            grade = "B";
            return 3.00;
        } else if (mark >= 55) {
            grade = "B-";
            return 2.75;
        } else if (mark >= 50) {
            grade = "C+";
            return 2.50;
        } else if (mark >= 45) {
            grade = "C";
            return 2.25;
        } else if (mark >= 40) {
            grade = "D";
            return 2.00;
        } else if (mark < 40) {
            grade = "F";
            return 0.00;
        } else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] marks = new double[4];
        double credit = 3;
        double total = 0, total_credit = 0;

        for (int i = 0; i < 4; i++) {
            int n = i + 1;
            System.out.print("\nInput mark of subject_" + n + ": ");
            marks[i] = to_gpa(input.nextDouble());
            System.out.println(" Gpa of subject_" + n + ": " + marks[i]);
//            System.out.print("Input credit of subject_" + n + ": ");
//            credit[i] = input.nextDouble();
            System.out.println("Gread of subject_" + n + ": " + grade);

            total = total + (marks[i] * credit);
            total_credit += credit;

        }
        double CGPA = total / total_credit;
        System.out.println("\nCGPA: " + CGPA);
    }
}
