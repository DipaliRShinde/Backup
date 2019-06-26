package com.stackroute.pe2;

import java.util.Arrays;
import java.util.Scanner;

//Program to Calculate Student Grade
public class StudentGrade {
    public static void main(String[] args) {
        Student student = new Student();
        student.grade();
    }
}

class Student {
    Scanner s = new Scanner(System.in);
    int numberstudent, minimumGrade, maximumGrade;
    float average, sum = 0;

    //Method to calculate Average, minimum and maximum grade.
    public void grade() {

        System.out.println("Enter the number of students: ");
        numberstudent = s.nextInt();
        int[] grade = new int[numberstudent];

        for (int i = 0; i < numberstudent; i++) {
            System.out.println("Enter the grade for student " + (i + 1) + ": ");
            grade[i] = s.nextInt();
            sum = sum + grade[i];
        }

        average = sum / numberstudent;
        System.out.println("The average is: " + average);
        Arrays.sort(grade);     //to sort array
        System.out.println("The minimum is: " + grade[0]);  //first index to print minimum grade
        System.out.println("The maximum is: " + grade[numberstudent - 1]); //last index to print maximum grade
    }
}