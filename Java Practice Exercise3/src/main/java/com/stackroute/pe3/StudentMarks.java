/* Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.   */

package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        try {
            StudentMarks.checkGradeRange();
        } catch (Exception e) {
            System.out.println("Grade is out of range");
        }
    }

    //Method to check grade of student
    public static void checkGradeRange() throws Exception {
        int numOfStudents;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        numOfStudents = scan.nextInt();
        int[] stuGrades = new int[numOfStudents];   //Array for grades

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + " : ");
            stuGrades[i] = scan.nextInt();

            if (stuGrades[i] > 0 && stuGrades[i] <= 100) {      //Checking for range
                System.out.println("Grade for student " + (i + 1) + " is between 1 to 100.");
            } else {
                throw new Exception("Error");
            }
        }
    }
}
