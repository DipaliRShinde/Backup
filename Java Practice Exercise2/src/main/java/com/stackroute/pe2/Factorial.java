package com.stackroute.pe2;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Factorial.factorialNumber();
        Factorial.longFactorial();
    }

    public static void factorialNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = s.nextInt();
        int fact = 1;

        for (int i = 1; i < number; i++) {

            fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            if (fact > 479001600) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }

            System.out.println("The factorial of " + i + " is " + fact);
        }
    }

    public static void longFactorial() {
        long i, fact = 1, j;
        System.out.println("Long Factorials: ");

        for (i = 1; i < Long.MAX_VALUE; i++) {                     //loop till maxvalue of long

            for (j = 1; j <= i; j++) {
                fact = fact * j;
            }
            if (i == 21) {
                System.out.println("The factorial of " + i + " is out of range");   //when i reach 21 factorial should be out of range for long
                break;
            }
            System.out.print("The factorial of " + i);
            System.out.println(":" + fact);
            fact = 1;

        }
    }
}