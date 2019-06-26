package com.stackroot.exercise1;

import java.util.Scanner;

//Program for Checking the input
public class CheckInput
{
    public static void main(String args[])
    {
        CheckInput.check();
    }

    static void check()
    {
        System.out.println("Enter Input: ");
        Scanner s = new Scanner(System.in);

        char ch=(char)s.nextLine().charAt(0);

        if(ch >= 97 && ch <= 123)
        {
            System.out.println("Lower Case");   //Executes if input is in lower case
        }
        else if(ch >= 65 && ch <= 96)
        {
            System.out.println("Upper Case");   //Executes if input is in Upper case
        }
        else if(ch >= 48 && ch <= 57)
        {
            System.out.println("Digit");        //Executes if input is digit
        }
        else if(ch >= 33 && ch <= 65)
        {
            System.out.println("Special Symbol");   //Executes if input is special symbol
        }
    }

}