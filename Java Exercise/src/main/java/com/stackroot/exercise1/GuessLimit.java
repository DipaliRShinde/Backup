package com.stackroot.exercise1;

import java.util.Scanner;

//Program to guess limit
public class GuessLimit
{
    public static void main(String args[])
    {
        GuessLimit.checkGuess();
    }

    public static void checkGuess()
    {
        Scanner s=new Scanner(System.in);

        int target=32;          //set target

        while(true)
        {
            System.out.println("Enter Number (1 - 50): ");      //message for user with given range
            int n=s.nextInt();

            if (target==n)
            {
                System.out.println("Number guessed matches the original number");   //print if guess matches
                break;
            }
            else if (target > n)
            {
                System.out.println("Number guessed is less than original number");      //print if guess is less than target
            }
            else
            {
                System.out.println("Number guessed is more than original number");      //print if guess is greater than target

            }

        }

    }

}

